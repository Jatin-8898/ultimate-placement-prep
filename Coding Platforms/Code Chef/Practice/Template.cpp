#include<bits/stdc++.h>
using namespace std;
#define ll long long
#define si(x) scanf("%d", &x)
#define sc(x) scanf("%c", &x)
#define sl(x) scanf("%lld", &x)
#define pl(x) printf("%lld\n", x)
#define pi(x) printf("%d\n", x)
#define gu getchar_unlocked
#define pu putchar_unlocked
#define setbits __builtin_popcountll
#define pb push_back
#define mp make_pair
#define MOD 1000000007
#define speed ios::sync_with_stdio(false)

const int N = 100005;


// FAST I/O

void fastscan(int &n){
    int sign = 1;
    n = 0;
    char c = gu();
    while( c < '0' || c > '9' ){
        if( c == '-' ) sign = -1;
        c = gu();
    }
    while( c >= '0' && c <= '9' ) n = (n<<3) + (n<<1) + c - '0', c = gu();  n = n * sign;
}
    
void fastscan(ll &n){
    int sign = 1;
    n = 0;
    char c = gu();
    while( c < '0' || c > '9' ){
        if( c == '-' )
        sign = -1;
        c = gu();
    }
    while( c >= '0' && c <= '9' ) n = (n<<3) + (n<<1) + c - '0', c = gu();  n = n * (ll)(sign);
}

void print(int n){
    if(n < 0){
        n = -n; pu('-');
    }
    int i = 10;
    char o[10];
    do{o[--i] = (n % 10) + '0'; n /= 10;} while(n);
    do{pu(o[i]);} while(++i < 10);
}

void lprint(ll n){
    if(n < 0LL){
        n = -n; pu('-');
    }
    int i = 21;
    char o[21];
    do{o[--i] = (n % 10LL) + '0'; n /= 10LL;} while(n);
    do{pu(o[i]);} while(++i < 21);
}

void sprint(const char a[]){
        const char *p = a;
        while(*p)pu(*p++);
}

// GCD - EUCLID'S ALGORITHM

ll gcd(ll a, ll b){
	if(b == 0){
		return a;
	}
	else{
		return gcd(b, a % b);
	}
}

// EXTENDED EUCLID'S ALGORITHM - aX + bY = gcd(a, b)

ll d, x, y;

ll egcd(ll a, ll b){
	if(b == 0){
		d = a;
		x = 1;
		y = 0;
		return a;
	}
	else{
		d = egcd(b, a % b);
		ll temp = x;
		x = y;
		y = temp - ((a / b) * y);
		return d;
	}
}

// EULER TOTIENT FUNCTION

int phi[N];

void etf(int n){
	int i, j;
	for(i = 0; i <= n; i++){
		phi[i] = i;
	}
	for(i = 2; i <= n; i++){
		if(phi[i] == i){
			for(j = i; j <= n; j += i){
				phi[j] /= i;
				phi[j] *= (i - 1);
			}
		}
	}
}

// POWER FUNCTION ( BINARY EXPONENTIATION ) - CALCULATES (a ^ b) % c

ll bin(ll a, ll b, ll c){
	ll ans = 1;
	while(b > 0){
		if(b % 2 == 1){
			ans = ((ans % c) * (a % c)) % c;
		}
		a = ((a % c) * (a % c)) % c;
		b /= 2;
	}
	return ans;
}

// OVERFLOW MULTIPLICATION - CALCULATES (a * b) % c

ll mul(ll a, ll b, ll c){
	ll res = 0;
	while(b > 0){
		if(b % 2 == 1){
			res = ((res % c) + (a % c)) % c;
		}
		a = ((a % c) + (a % c)) % c;
		b /= 2;
	}
	return res;
}

// POWER FUNCTION - OVERFLOW CASE - CALCULATES (a ^ b) % c

ll bin1(ll a, ll b, ll c){
	ll ans = 1;
	while(b > 0){
		if(b % 2 == 1){
			ans = mul(ans, a, c) % c;
		}
		a = mul(a, a, c) % c;
		b /= 2;
	}
	return ans;
}

// MODULAR MULTIPLICATIVE INVERSE ( where c = prime )

ll inv(ll b, ll c){
	return bin(b, c - 2, c) % c;
} 

// MODULAR MULTIPLICATIVE INVERSE ( where gcd(b, c) = 1 )

ll inv1(ll b, ll c){
	if(egcd(b, c) != 1){
		return -1;
	}
	else{
		egcd(b, c);
		ll res = ((x % c) + c) % c;
		return res;
	}
}

// MILLER RABIN PRIMALITY TEST

bool millerrabin(ll n){
	if(n <=1 || n % 2 == 0){
		if(n != 2){
			return false;
		}
	}
	if(n == 2 || n == 3){
		return true;
	}
	ll d = n-1;
	while(d % 2 == 0){
		d /= 2;
	}
	ll a[12] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37};
	for(int i = 0; i < 12 && a[i] < n; ++i){
		ll temp = d;
		ll mod = largepow(a[i], temp, n);
		if( mod == 1 || mod == n-1){
			continue;
		}
		while(temp != n-1 && mod != n-1){
			mod = fastmul(mod, mod, n);
			temp *= 2;
		}
		if(mod != n-1){
			return false;
		}
	}
	return true;
}

// SOLUTIONS OF LINEAR DIOPHANTINE EQUATIONS ( Non Negative )

ll lde(ll a, ll b, ll c){
	ll gcd = egcd(a, b);
	if(c % gcd != 0){
		return 0;
	}
	else if(c == 0){
		return 1;
	}
	else{
		long double p = (long double)(-x * c) / b;
		long double q = (long double)(y * c) / a;
		if(q < p){
			long double temp = p;
			p = q;
			q = temp;
		}
		return floor(q) - ceil(p) + 1;
	}
}

// DISJOINT SUBSET

// two arrays arr[] and size[] of size <n> required

void setupDS(int arr[], int size[], int n){
	for(int i = 0; i < n; i++){
		arr[i] = i;
		size[i] = 1;
	}
}

int rootDS(int arr[], int n, int A){
	while(arr[A] != A){
		arr[A] = arr[arr[A]];
		A = arr[A];
	}
	return A;
}

void unionDS(int arr[], int size[], int n, int A, int B){
	int rootA = rootDS(arr, n, A);
	int rootB = rootDS(arr, n, B);
	if(size[rootA] < size[rootB]){
		arr[rootA] = arr[rootB];
		size[rootB] += size[rootA];
	}
	else{
		arr[rootB] = arr[rootA];
		size[rootA] += size[rootB];
	}
}

// KMP STRING MATCHING ALGORITHM

int failure[N];

void buildFA(string pattern){
	int i = 1, j = 0;
	failure[0] = 0;
	while(i < pattern.size()){
		if(pattern[i] == pattern[j]){
			failure[i] = j + 1;
			i++; j++;
		}
		else{
			if(j != 0){
				j = failure[j - 1];
			}
			else{
				failure[i] = 0;
				i++;
			}
		}
	}
}

void kmp(string text, string pattern){ // search for pattern in text
	int m = text.size(); int n = pattern.size();
	buildFA(pattern);
	int i = 0, j = 0;
	while(i < m){
		if(pattern[j] == text[i]){
			i++; j++;
		}
		if(j == n){
			printf("FOUND AT %d\n", i - j);
			j = failure[j - 1];
		}

		else if(i < m && pattern[j] != text[i]){
			if(j != 0){
				j = failure[j - 1];
			}
			else{
				i++;
			}
		}
	}
}

// Z ALGORITHM 

int z[N];

void buildZA(string s){
	int l = 0, r = 0, i, k;
	int n = s.size();
	z[0] = 0;
	for(i = 1; i < n; i++){
		if(i > r){
			l = i; r = i;
			while(r < n && s[r - l] == s[r]){
				r++;
			}
			z[i] = r - l;
		}
		else{
			k = i - l;
			if(z[k] < r - i + 1){
				z[i] = z[k];
			}
			else{
				l = i;
				while(r < n && s[r - l] == s[r]){
					r++;
				}
				z[i] = r - l;
				r--;
			}
		}
	}
}

// MATRIX MULTIPLICATION MODULO 'c'

// mat1[m][n], mat2[n][p], res[m][p]
// res is the result matrix

void matmul(ll mat1[m][n], ll mat2[n][p], ll res[m][p], int m, int n, int p, ll c){
	for(int i = 0; i < m; i++){
		for(int j = 0; j < p; j++){
			ll num = 0;
			for(int k = 0; k < n; k++){
				num += ((mat1[i][k] % c) * (mat2[k][j] % c)) % c;
			}
			res[i][j] = num % c;
		}
	}
}

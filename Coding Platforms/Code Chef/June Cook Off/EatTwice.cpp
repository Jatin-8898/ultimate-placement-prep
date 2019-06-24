#include <iostream>
#include <bits/stdc++.h>
#define ll              long long
#define ull             unsigned long long
#define fn(i,n)         for(int i=0; i<n; ++i)
#define fa(i,a,n)       for(int i=a; i<n; ++i)
#define rfn(i,n,a)      for(int i=n; i>=a; --i)
#define fll(i,a,n)      for(ll i=a; i<=n; ++i)
#define rfll(i,n,a)     for(ll i=n; i>=a; --i)
#define vi              vector<int>
#define vll             vector<ll>
#define all(v)          v.begin(),v.end()
#define pi              pair<int, int>
#define pll             pair<ll,ll>
#define GCD(a,b)        __gcd(a,b)
#define MOD             1000000007
#define INF             LLONG_MAX
#define PI              3.14159265
#define endl            "\n"
#define debug(x)        cout << x << endl
#define flash   ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
using namespace std;

int main() {
	flash;
	int t, n, m, d, v;
	cin >> t;
	
	while(t--){

        cin >> n >> m;
		int arr[m+1];

		for(int j=0; j<n; j++)
		{
			cin >> d >> v;
			if(v > arr[d])
			    arr[d] = v;
		}
		sort(arr, arr+n);
		cout<< (arr[n] + arr[n-1]);
	
	}
	return 0;
}

/* import java.util.*;

 class dish {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int t= sc.nextInt();
	for(int i=0;i<t;i++)
	{
		int n= sc.nextInt();
		int m=sc.nextInt();
		int[] arr=new int[m+1];
		for(int j=0;j<n;j++)
		{
			int d=sc.nextInt();
			int v=sc.nextInt();
			if(v>arr[d])
			
			arr[d]=v;
			
		}
		Arrays.sort(arr);
		System.out.println(arr[m]+arr[m-1]);
	}
	
}
} */
//long time no ac
#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
typedef pair<int ,int> pii;
typedef pair<ll ,ll> pll;
#define F first
#define S second
#define pb push_back
#define mp make_pair
#define all(X) (X).begin(), (X).end()
#define sll(n) scanf("%lld",&n)
#define sll2(x,y) scanf("%lld%lld",&x,&y)
#define sll3(x,y,z) scanf("%lld%lld%lld",&x,&y,&z)
#define REP(i,x,y) for(ll i = x;i <= y;++i)
#define debug(x) cerr<<#x<<"::"<<x<<endl
#define debug2(x,y) cerr<<#x<<" :: "<<x<<"\t"<<#y<<" :: "<<y<<"\n"
#define debug3(x,y,z) cerr<<#x<<" :: "<<x<<"\t"<<#y<<" :: "<<y<<"\t"<<#z<<" :: "<<z<<"\n"
#define debug4(x,y,z,w) cerr<<#x<<" :: "<<x<<"\t"<<#y<<" :: "<<y<<"\t"<<#z<<" :: "<<z<<"\t"<<#w<<" :: "<<w<<"\n"
ll power(ll x,ll y,ll z) {
	ll ret = 1;
	while(y > 0) {
		if(y & 1) ret = (ret*x)%z;
		x = (x*x)%z;
		y >>= 1;
	}
	return ret;
}
const ll N = 1e5+5,MX = 1e10+5;
vector<pll >A;
vector<ll> primes;
ll prime[N];
void doit(ll x) {
	ll tmp = x*x,cnt = 3;
	while(tmp < MX) {
		ll sum = cnt;
		if(!prime[cnt]) A.pb(mp(tmp,sum));
		++cnt;
		tmp *= x;
	}
	return;
}
void seive() {
	for(ll i = 2;i < N; ++i) {
		if(!prime[i]) {
			primes.pb(i);
			for(ll j = i*i;j < N;j += i) {
				prime[j] = 1;
			}
		}
	}
	for(auto u : primes) doit(u);
	return;
}
ll dp[N << 2];
int main() {
	
	seive();
	sort(all(A));
	ll sz = A.size();
	REP(i,1,sz) dp[i] = dp[i-1] + A[i-1].S;
	// REP(i,0,4) debug(A[i].F);
	ll t;
	sll(t);
	while(t--) {
		ll x,y;
		sll2(x,y);
		ll lo = 0,hi = 0;
		hi = upper_bound(all(A),mp(y+1,0LL)) - A.begin();
		lo = lower_bound(all(A),mp(x,0LL)) - A.begin();
		// debug2(lo,hi);
		ll ans = dp[hi] - dp[lo];
		printf("%lld\n",ans);
	}
	
	

	return 0;
}
#include <algorithm>
#include <bitset>
#include <cctype>
#include <cmath>
#include <cstdio>
#include <cstdlib>
#include <cstring>
#include <ctime>
#include <deque>
#include <fstream>
#include <functional>
#include <inttypes.h>
#include <iomanip>
#include <iostream>
#include <limits>
#include <list>
#include <map>
#include <numeric>
#include <queue>
#include <set>
#include <sstream>
#include <stack>
#include <string>
#include <unordered_map>
#include <unordered_set>
#include <utility>
#include <vector>

using namespace std;

int test_count, n, m;
int main() {
  cin.tie(0);
  ios::sync_with_stdio(0);

  cin >> test_count;

  for( int test = 0; test < test_count; ++test ) {

    cout << "\nTest case: " << test << endl;

    cin >> n >> m;

    for( int i = 0; i < n; ++i ) {
      cout << "Processing row " << i << endl;

      for( int j = 0; j < m; ++ j ) {
        string token;
        cin >> token;
        cout << "Word in position (" << i << "," << j << ") : "<< token << endl;
      }
    }
  }

  return 0;
}
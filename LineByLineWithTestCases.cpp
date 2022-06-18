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

//Remove white spaces at the end and beginning of the string, but in place, the method does not return a new string, but modifies the string that takes as argument
void trim(string & c) {
  if (c.size() == 0) return;
  int i, p = -1, q = -1;
  for (i = 0; i < c.size(); ++i)
    if (int(c[i]) % 255 > int(' ')) {
      p = i;
      break;
    } for (i = c.size() - 1; i >= 0; --i)
    if (int(c[i]) % 255 > int(' ')) {
      q = i;
      break;
    } c = p == -1 ? "" : c.substr(p, q - p + 1);
}

//Same as trim but this method does return a new string
inline string trimm(string c) {
  string s(c);
  trim(s);
  return s;
}

//Takes string and return a vector of values after splitting it, the type of that data depends on it use 
template < class T > vector < T > strtovt(string s) {
  vector < T > ret;
  istringstream f(s);
  T tmp;
  while (f >> tmp) ret.push_back(tmp);
  return ret;
}

//Takes string and returns a vector of strings after splitting it, it uses the character in the argument “d” to do the splitting.
vector < string > tokenize(const string & str,
  const string & d = " ") {
  vector < string > t;
  int up = str.find_first_not_of(d, 0);
  int pos = str.find_first_of(d, up);
  while (string::npos != pos || string::npos != up) {
    t.push_back(str.substr(up, pos - up));
    up = str.find_first_not_of(d, pos);
    pos = str.find_first_of(d, up);
  }
  return t;
}

//Split a string by a delimiter and return a vector of ints
vector < int > splittoint(const string & s,
  const string & delim = " ") {
  vector < string > tok = tokenize(s, delim);
  vector < int > res;
  for (int i = 0; i < tok.size(); ++i) res.push_back(atoi(tok[i].c_str()));
  return res;
}

//Return the long long value of a string
unsigned long long toi64(string s) {
  unsigned long long v;
  istringstream sin(s);
  sin >> v;
  return v;
}

//Return a string representation of the value x (of any native kind)
template < class T > string tostring(T x) {
  ostringstream sout;
  sout << x;
  return sout.str();
}

//Return the int value of the argument it takes
template < class T > int toint(T s) {
  int v;
  istringstream sin(tostring(s));
  sin >> v;
  return v;
}

//Return the int value of the argument it takes, mixing C++ string data type and C atoi function
inline int s2i(string a) {
  return atoi(a.c_str());
}

//Return the double value of the argument it takes
double todouble(string s) {
  double v;
  istringstream sin(s);
  sin >> v;
  return v;
}

int test_count, n, m;
int main() {
  cin.tie(0);
  ios::sync_with_stdio(0);
  string line;
  getline(cin,line);
  test_count = toint(line);
  for( int test = 0; test < test_count; ++test ) {

    cout << "\nTest case: " << test << endl;

    getline(cin,line);
    vector<string> tokens = tokenize(line, " ");
    n = toint(tokens[0]);
    m = toint(tokens[1]);

    for( int i = 0; i < n; ++i ) {
      cout << "Processing row " << i << endl;

      getline(cin,line);
      vector<string> tokens = tokenize(line, " ");
      
      for( int j = 0; j < m; ++ j ) {
        cout << "Word in position (" << i << "," << j << ") : "<< tokens[j] << endl;
      }
    }
  }

  return 0;
}
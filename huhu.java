///**
// * 2017/3/31 21:17
// *
// * @author changyi yuan
// */
//#include<iostream>
//#include<vector>
//
//using namespace std;
//
//public class huhu {
//
//    struct treeNode{
//        int no;
//        int depth;
//        treeNode * p;
//    };
//
//    int main(){
//        int n, m, k;
//        vector<int> dNum;
//        vector<vector<int>> index;
//        int leaves[101];
//        int dis[101][101];
//
//        int parent[101];
//        int done[101];
//        for (int i = 0; i < 101; i++){
//            parent[i] = 0;
//            done[i] = 0;
//            leaves[i] = 0;
//        }
//
//        for (int i = 0; i < 101; i++)
//            for (int j = 0; j < 101; j++)
//                dis[i][j] = 0;
//
//        cin >> n >> m >> k;
//        for (int i = 0; i < m; i++){
//            int temp;
//            cin >> temp;
//            dNum.push_back(temp);
//        }
//
//        for (int i = 0; i < m; i++){
//            vector<int> vec;
//            for (int j = 0; j < dNum[i]; j++){
//                int temp;
//                cin >> temp;
//                vec.push_back(temp);
//            }
//            index.push_back(vec);
//        }
//
//        int l[100];
//        for (int i = 0; i < k; i++){
//            int temp;
//            cin >> temp;
//            leaves[temp]=1;
//            l[i] = temp;
//        }
//
//        for (int i = 0; i < k; i++)
//            for (int j = 0; j < k; j++)
//                cin >> dis[l[i]][l[j]];
//
//        for (int depth = m - 1; depth > 0; depth--){
//            for (int i = 0; i < dNum[depth]; i++){
//                int no = index[depth][i];
//                if (done[no])
//                    continue;
//                done[no] = 1;
//
//                int firstNo;
//                for (int j = 0; j < dNum[depth - 1]; j++){
//                    //cout << index[depth - 1][j] << endl;
//                    if (leaves[index[depth - 1][j]] == 0){
//                        firstNo = index[depth - 1][j];
//                        leaves[index[depth - 1][j]] = 1;
//                        break;
//                    }
//                }
//
//                parent[no] = firstNo;
//                for (int j = 1; j <= n; j++){
//                    if (dis[no][j] == 2) {
//                        parent[j] = firstNo;
//                        done[j] = 1;
//                    }
//                    dis[firstNo][j] = dis[no][j] - 1;
//                    dis[j][firstNo] = dis[firstNo][j];
//                }
//
//            }
//        }
//        for (int i = 1; i < n + 1; i++)
//            cout << parent[i] << " ";
//
//    }
//}

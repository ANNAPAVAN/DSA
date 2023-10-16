#include<iostream>
using namespace std;
class node{
	public:
	int data;
	node *left;
	node *right;
	node(int d){
		this->data=d;
		this->left=NULL;
		this->right=NULL;
	}
};

void printInord(node *temp){

	if(temp==NULL)
		return;
	printInord(temp->left);
	cout<<temp->data<<" ";
	printInord(temp->right);
	
}

void printPreord(node *temp){
	if(temp==NULL)
		return;

	cout<<temp->data<<" ";
	printPreord(temp->left);
	printPreord(temp->right);
	
}

void printPostord(node *temp){
	if(temp==NULL)
		return;
	
	printPostord(temp->left);
	printPostord(temp->right);
	cout<<temp->data<<" ";
	
}
int main(){
	node *root;
	root=new node(1);
	root->left=new node(2);
	root->right=new node(3);
	root->left->left=new node(4);
	root->left->right=new node(5);
	root->right->left=new node(6);
	root->right->right=new node(7);
	cout<<"inord is:"<<endl;
	printInord(root);
	cout<<"Pre ord is"<<endl;
	printPreord(root);
	cout<<"post ord is"<<endl;
	printPostord(root);
	
}

//Level Order Transversal
//#include<iostream>
//#include<queue>
//using namespace std;
//class node{
//	public:
//	int data;
//	node *left;
//	node *right;
//	node(int d){
//		this->data=d;
//		this->left=NULL;
//		this->right=NULL;
//	}
//};
//
//void printlev(node *temp){
//	cout<<"Elements are:"<<endl;
//	if(temp==NULL)
//		return;
//	queue<node *>q;
//	q.push(temp);
//		while (q.empty() == false) 
//    { 
//       
//        node *n = q.front(); 
//        cout << n->data << " "; 
//        q.pop(); 
//
//     
//        if (n->left != NULL) 
//            q.push(n->left); 
//
//        if (n->right != NULL) 
//            q.push(n->right); 
//    } 
//		
//	}
//
//
//int main(){
//	node *root;
//	root=new node(1);
//	root->left=new node(2);
//	root->right=new node(3);
//	root->left->left=new node(4);
////	root->left->right=new node(5);
//	root->right->left=new node(6);
//	root->right->right=new node(7);
//	printlev(root);
//	
//}

//Insert
//#include<iostream>
//#include<queue>
//using namespace std;
//class node{
//	public:
//	int data;
//	node *left;
//	node *right;
//	node(int d){
//		this->data=d;
//		this->left=NULL;
//		this->right=NULL;
//	}
//};
//
//void printlev(node *temp,int k){
//	cout<<"Elements are:"<<endl;
//	if(temp==NULL)
//		return;
//	queue<node *>q;
//	q.push(temp);
//		while (q.empty() == false) 
//       { 
//       
//        node *n = q.front(); 
//        q.pop();
//        if(n->left==NULL){
//        	n->left=new node(k);
//        	break;
//        	
//         }
//		
//        else
//        q.push(n->left);
//        	
//        if(n->right==NULL){
//        	n->right=new node(k);
//        
//        	break;
//		}
//        	
//        else
//          q.push(n->right);
//      } 
//		
//	}
//	
//void printlev1(node *temp){
//	cout<<"Elements are:"<<endl;
//	if(temp==NULL)
//		return;
//	queue<node *>q;
//	q.push(temp);
//		while (q.empty() == false) 
//    { 
//       
//        node *n = q.front(); 
//        cout << n->data << " "; 
//        q.pop(); 
//
//     
//        if (n->left != NULL) 
//            q.push(n->left); 
//
//        if (n->right != NULL) 
//            q.push(n->right); 
//    } 
//		
//	}
//
//
//int main(){
//	node *root;
//	root=new node(1);
//	root->left=new node(2);
//	root->right=new node(3);
//	root->left->left=new node(4);
//	root->left->right=new node(5);
//	root->right->left=NULL;
//	root->right->right=new node(7);
//	printlev(root,100);
////	printlev1(root);
//	
//}

//Deleting node

//#include<iostream>
//#include<queue>
//using namespace std;
//class node{
//	public:
//	int data;
//	node *left;
//	node *right;
//	node(int d){
//		this->data=d;
//		this->left=NULL;
//		this->right=NULL;
//	}
//};
//
//void inord(node *temp){
//	if(temp==NULL)
//		return;
//	inord(temp->left);
//	cout<<temp->data<<" ";
//	inord(temp->right);
//	
//}
//
//void deletedeep(node *temp,node *n){
//	queue<node *>q;
//	q.push(temp);
//	node *t;
//	while(q.empty()!=true){
//		t=q.front();
//		q.pop();
//		if(t->right){
//			if(t->right==n){
//				t->right=NULL;
//				delete(n);
//				return;
//			}
//			else
//				q.push(t->right);
//		}
//		if(t->left){
//			if(t->left==n){
//				t->left=NULL;
//				delete(n);
//				return;
//			}
//			else
//				q.push(t->left);
//		}
//	}
//}
//
//void deletion(node *temp,int key){
//	node *keynode;
//	queue<node *>q;
//	q.push(temp);
//	node *n;
//	while(q.empty()!=true){
//		n=q.front();
//		q.pop();
//		if(n->data==key)
//			keynode=n;
//		if(n->left)
//			q.push(n->left);
//		if(n->right)
//			q.push(n->right);
//	}
//	keynode->data=n->data;
//	deletedeep(temp,n);
//}
//
//int main(){
//	node *root;
//	root=new node(1);
//	root->left=new node(2);
//	root->right=new node(3);
//	root->left->left=new node(4);
//	root->left->right=new node(5);
////	root->right->left=new node(6);
////	root->right->right=new node(7);
//	int key=2;
//	inord(root);
//	deletion(root,key);
//	cout<<endl;
//	inord(root);
//}

//LCA
//#include<iostream>
//#include<vector>
//using namespace std;
//class node{
//	public:
//		int data;
//		node *left;
//		node *right;
//		node(int d){
//			this->data=d;
//			this->left=NULL;
//			this->right=NULL;
//		}
//};
//
//bool findpath(node *temp,vector<int>&path,int n){
//	if(temp==NULL)
//		return false;
//	path.push_back(temp->data);
//	if(temp->data==n)
//		return true;
//	if(temp->left && (findpath(temp->left,path,n)) || temp->right && (findpath(temp->right,path,n)))
//		return true;
//	path.pop_back();
//		return false;
//	
//}
//
//int findLCA(node *temp,int n1,int n2){
//	vector<int>p1,p2;
//	if(!findpath(temp,p1,n1) || !findpath(temp,p2,n2))
//		return -1;
//	int i=0;
//	for(i=0;i<p1.size() && p2.size();i++){
//	    if(p1[i]!=p2[i])
//	    	break;
//	}
//	return p1[i-1];
//}
//
//int main(){
//	node *root;
//	root=new node(1);
//	root->left=new node(2);
//	root->right=new node(3);
//	root->left->left=new node(4);
//	root->left->right=new node(5);
//	root->right->left=new node(6);
//	root->right->right=new node(7);
//	cout << "LCA(4, 5) = " << findLCA(root, 4, 5);
//    cout << "\nLCA(4, 6) = " << findLCA(root, 4, 6);
//    cout << "\nLCA(3, 4) = " << findLCA(root, 3, 4);
//    cout << "\nLCA(2, 4) = " << findLCA(root, 2, 4);
//
//	
//}

//LCA method 2
//#include<iostream>
//#include<vector>
//using namespace std;
//class node{
//	public:
//		int data;
//		node *left;
//		node *right;
//		node(int d){
//			this->data=d;
//			this->left=NULL;
//			this->right=NULL;
//		}
//};
//
//node *findLCA(node *temp,int n1,int n2){
//	if(temp==NULL)
//		return NULL;
//	if(temp->data==n1 || temp->data==n2)
//		return temp;
//	
//	node *left_lca=findLCA(temp->left,n1,n2);
//	node *right_lca=findLCA(temp->right,n1,n2);
//	
//	
//	if(left_lca && right_lca)
//		return temp;
//	return (left_lca!=NULL)? left_lca:right_lca;
//	
//}
//int main(){
//	node *root;
//	root=new node(1);
//	root->left=new node(2);
//	root->right=new node(3);
//	root->left->left=new node(4);
//	root->left->right=new node(5);
//	root->right->left=new node(6);
//	root->right->right=new node(7);
//	cout << "LCA(4, 5) = " << findLCA(root, 4, 5)->data;
//    cout << "\nLCA(4, 6) = " << findLCA(root, 4, 6)->data;
//    cout << "\nLCA(3, 4) = " << findLCA(root, 3, 4)->data;
//    cout << "\nLCA(2, 4) = " << findLCA(root, 2, 4)->data;
//}

//Diameter of a binary tree
//#include<iostream>
//using namespace std;
//
//class node{
//	public:
//		int data;
//		node *left,*right;
//		node(int d){
//			this->data=d;
//			this->left=NULL;
//			this->right=NULL;
//		}
//};
//
//int height(node *temp){
//	if(temp==NULL)
//		return 0;
//	return 1+max(height(temp->left),height(temp->right));
//	
//}
//
//
//
//int diameter(node *root){
//	if(root==NULL)
//		return 0;
//	
//
//	
//	int ldiameter=diameter(root->left);
//	int rdiameter=diameter(root->right);
//	
//		int lheight=height(root->left);
//	int rheight=height(root->right);
//	
//	return max(lheight+rheight+1,max(ldiameter,rdiameter));
//}
//
//
//
//int main(){
//	node *root;
//	root=new node(1);
//	root->left=new node(2);
//	 root->right=new node(3);
//	 root->left->left=new node(4);
//    root->left->right=new node(5);
//	root->right->left=new node(6);
//	root->right->right=new node(7);
//	cout<<"Diameter of the given tree is: "<<diameter(root);
//	
//}

//Left View of Binary Tree
//#include<iostream>
//#include<queue>
//using namespace std;
//class node{
//	public:
//		int data;
//		node *left;
//		node *right;
//		node(int d){
//			this->data=d;
//			this->left=NULL;
//			this->right=NULL;
//		}
//};
//
//
//void leftView(node *temp){
//	queue<node *>q;
//	if(temp==NULL)
//		return;
//	q.push(temp);
//	q.push(NULL);
//	while(q.empty()!=true){
//		node *t=q.front();
//		if(t){
//			cout<<t->data<<" ";
//			while(q.front()!=NULL){
//				if(t->left)
//					q.push(t->left);
//				if(t->right)
//					q.push(t->right);
//				q.pop();
//				t=q.front();
//			}
//			q.push(NULL);
//		}
//		q.pop();
//	}
//}
//
//
//int main(){
//		node *root;
//	root=new node(1);
//	root->left=new node(2);
//	 root->right=new node(3);
//	 root->left->left=new node(4);
//    root->left->right=new node(5);
//	root->right->left=new node(6);
//	root->right->right=new node(7);
//	leftView(root);
//}

//Right View

//#include<iostream>
//#include<queue>
//using namespace std;
//class node{
//	public:
//		int data;
//		node *left;
//		node *right;
//		node(int d){
//			this->data=d;
//			this->left=NULL;
//			this->right=NULL;
//		}
//};
//
//
//void rightView(node *temp){
//	queue<node *>q;
//	if(temp==NULL)
//		return;
//	q.push(temp);
//	q.push(NULL);
//	while(q.empty()!=true){
//		node *t=q.front();
//		node *e=NULL;
//		if(t){
//			while(q.front()!=NULL){
//				if(t->left)
//					q.push(t->left);
//				if(t->right)
//					q.push(t->right);
//				e=q.front();
//				q.pop();
//				t=q.front();
//			}
//			cout<<e->data<<" ";
//			q.push(NULL);
//		}
//		q.pop();
//		
//	}
//}
//
//
//int main(){
//		node *root;
//	root=new node(1);
//	root->left=new node(2);
//	 root->right=new node(3);
//	 root->left->left=new node(4);
//    root->left->right=new node(5);
//	root->right->left=new node(6);
//	root->right->right=new node(7);
//	rightView(root);
//}

//Top View
//#include<iostream>
//#include<queue>
//#include<map>
//using namespace std;
//class node{
//	public:
//		int data;
//		int hd;
//		node *left;
//		node *right;
//		node(int d){
//			this->data=d;
//			this->left=NULL;
//			this->right=NULL;
//		}
//};
//
//void topView(node *temp){
//	if(temp==NULL)
//		return;
//	queue<node *>q;
//	map<int,int>m;
//	int hd=0;
//	temp->hd=hd;
//	q.push(temp);
//	while(q.size()){
//		hd=temp->hd;
//		if(m.count(hd)==0)
//			m[hd]=temp->data;
//		
//		if(temp->left){
//			temp->left->hd=hd-1;
//			q.push(temp->left);
//		}
//		
//		
//		if(temp->right){
//			temp->right->hd=hd+1;
//			q.push(temp->right);
//		}
//		
//		q.pop();
//		temp=q.front();
//			
//	}
//	for(auto i=m.begin();i!=m.end();i++){
//		cout<<i->second<<" ";
//	}
//}
//
//int main(){
//	node *root;
//	root=new node(1);
//	root->left=new node(2);
//	 root->right=new node(3);
//	 root->left->left=new node(4);
//    root->left->right=new node(5);
//	root->right->left=new node(6);
//	root->right->right=new node(7);
//	topView(root);
//}

//Bottom View
//#include<iostream>
//#include<queue>
//#include<map>
//using namespace std;
//class node{
//	public:
//		int data;
//		int hd;
//		node *left;
//		node *right;
//		node(int d){
//			this->data=d;
//			this->left=NULL;
//			this->right=NULL;
//		}
//};
//
//void bottomView(node *temp){
//	if(temp==NULL)
//		return;
//	queue<node *>q;
//	map<int,int>m;
//	int hd=0;
//	temp->hd=hd;
//	q.push(temp);
//	while(q.size()){
//		hd=temp->hd;
//			m[hd]=temp->data;
//		
//		if(temp->left){
//			temp->left->hd=hd-1;
//			q.push(temp->left);
//		}
//		
//		
//		if(temp->right){
//			temp->right->hd=hd+1;
//			q.push(temp->right);
//		}
//		
//		q.pop();
//		temp=q.front();
//			
//	}
//	for(auto i=m.begin();i!=m.end();i++){
//		cout<<i->second<<" ";
//	}
//}
//
//int main(){
//	node *root;
//	root=new node(1);
//	root->left=new node(2);
//	 root->right=new node(3);
//	 root->left->left=new node(4);
//    root->left->right=new node(5);
//	root->right->left=new node(6);
//	root->right->right=new node(7);
//	bottomView(root);
//}

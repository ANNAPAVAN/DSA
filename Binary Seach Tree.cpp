//Binary Search Tree - Search
//#include<iostream>
//using namespace std;
//class node{
//	public:
//		int data;
//		node *left;
//		node *right;
//	node(int d){
//		this->data=d;
//		this->left=NULL;
//		this->right=NULL;
//	}
//};
//
//node* search(node *root,int key){
//	if(root==NULL || root->data==key)
//		return root;
//	if((root->data)<key)
//		return search(root->right,key);
//    else
//		return search(root->left,key);
//}
//
//
//int main(){
//	node *root=new node(30);
//	root->left=new node(20);
//	root->right=new node(40);
//    
//    int key=40;
//    if(search(root,key)!=NULL)
//    	cout<<"Key Found"<<endl;
//    else
//    	cout<<"Key not Found"<<endl;
//	
//	
//}

//Insertion
//#include<iostream>
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
//void inorder(node *temp){
//	    if(temp==NULL)
//	    	return;
//		inorder(temp->left);
//	    cout<<temp->data<<" ";
//		inorder(temp->right);
//}
//
//
//node* insert(node *temp,int key){
//	if(temp==NULL)
//		return new node(key);
//
//	if(key<temp->data)	
//	 	temp->left=insert(temp->left,key);
//	else if(key>temp->data)
//		temp->right=insert(temp->right,key);
//	return temp;
//}
//
//int main(){
//	node *root=NULL;
//	root=insert(root,50);
//	insert(root, 30);
//    insert(root, 20);
//    insert(root, 40);
//    insert(root, 70);
//    insert(root, 60);
//    insert(root, 80);
//    
//    inorder(root);
//	return 0;
//}

//Delete node

#include<iostream>
using namespace std;
class node{
	public:
		int data;
		node *right;
		node *left;
		node(int d){
			this->data=d;
			this->right=NULL;
			this->left=NULL;
		}
};

node* insert(node *temp,int n){
	if(temp==NULL)
		return new node(n);
	if(n<temp->data)
		temp->left=insert(temp->left,n);
	else
		temp->right=insert(temp->right,n);
	return temp;
		
}

void inorder(node *root){
	if(root==NULL)
		return;
	inorder(root->left);
	cout<<root->data<<" ";
	inorder(root->right);
}

node* minvaluenode(node *t){
	node *temp=t;
	while(temp->left!=NULL){
		temp=temp->left;
	}
	return temp;
}

node *deletenode(node* temp,int n){
	if(temp==NULL)
		return temp;
	
	if(n<temp->data)
		temp->left=deletenode(temp->left,n);
	else if(n>temp->data)
	
		temp->right=deletenode(temp->right,n);
	
	else{
		if(temp->left==NULL){
			node *t=temp->right;
			delete(temp);
			return t;
		}
		else if(temp->right==NULL){
			node *t=temp->left;
			delete(temp);
			return t;
		}
		
		//for node having two children
		node *t=minvaluenode(temp->right);
		temp->data=t->data;
		
		
		//delete the right sub tree min node
		temp->right=deletenode(temp->right,t->data);
	}
		
	return temp;
}

int main(){
	node *root=NULL;
	root=insert(root,50);
	insert(root,30);
	insert(root,20);
	insert(root,40);
	insert(root,70);
	insert(root,60);
	insert(root,80);
	cout<<"Inorder Transversal is"<<endl;
	inorder(root);
	
	
	cout<<"\nDelete 20\n";
    root = deletenode(root, 20);
    cout<<"Inorder traversal of the modified tree \n";
    inorder(root);

    cout<<"\nDelete 30\n";
    root = deletenode(root, 30);
    cout<<"Inorder traversal of the modified tree \n";
    inorder(root);

    cout<<"\nDelete 50\n";
    root = deletenode(root, 50);
    cout<<"Inorder traversal of the modified tree \n";
    inorder(root);
	
}

//LCA of the BST

//#include<iostream>
//using namespace std;
//class node{
//	public:
//		int data;
//		node *right;
//		node *left;
//		node(int d){
//			this->data=d;
//			this->right=NULL;
//			this->left=NULL;
//			
//		}
//};
//
//node* lca(node *temp,int n1,int n2){
//	if(temp==NULL)
//		return temp;
//	if(temp->data>n1 && temp->data>n2)
//		return lca(temp->left,n1,n2);
//	if(temp->data<n1 && temp->data<n2)
//		return lca(temp->right,n1,n2);
//		
//	return temp;
//}
//
//int main(){
//	node *root = new node(20); 
//    root->left = new node(8); 
//    root->right = new node(22); 
//    root->left->left = new node(4); 
//    root->left->right = new node(12); 
//    root->left->right->left = new node(10); 
//    root->left->right->right = new node(14); 
//    
//    int n1 = 10, n2 = 14; 
//    node *t = lca(root, n1, n2); 
//    cout << "LCA of " << n1 << " and " << n2 
//         << " is " << t->data<<endl; 
//
//    n1 = 14, n2 = 8; 
//    t = lca(root, n1, n2); 
//    cout<<"LCA of " << n1 << " and " << n2 
//        << " is " << t->data << endl; 
//
//    n1 = 10, n2 = 22; 
//    t = lca(root, n1, n2); 
//    cout << "LCA of " << n1 << " and " << n2 
//         << " is " << t->data << endl;
//}
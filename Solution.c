bool isPalindrome(int x) {
    if(x < 0){
        return(false);
    }
    long l = 0;
    int c = x;
    while(c != 0){
        l = l * 10;
        l = l + c % 10;
        c = c / 10;
    }
    if(l == x){
        return true;
    }
    else{
        return false;
    }
}

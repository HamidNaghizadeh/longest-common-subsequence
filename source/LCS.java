package com.hamidnagizadeh;

public class LCS {
  private String firstString;
  private String secondString;

  private int[][] c;

  private int n;
  private int m;

  private char[] firstStringArray;
  private char[] secondStringArray;

  public LCS(String firstString , String secondString){

    this.firstString=firstString;
    this.secondString=secondString;

    n=firstString.length()+1;
    m=secondString.length()+1;

    castStringToArray();

    c = new int[n][m];

    startProcess();

  }

  private void castStringToArray(){
    firstStringArray=new char[n];
    secondStringArray=new char[m];

    firstStringArray[0]='0';
    secondStringArray[0]='0';
    for(int i=1;i<n;i++){
      firstStringArray[i]=firstString.charAt(i-1);  ;
    }
    for (int i=1;i<n;i++){
      System.out.print(firstStringArray[i] + " ");
    }

    for(int i=1;i<m;i++){
      secondStringArray[i]=secondString.charAt(i-1);  ;
    }
    for (int i=1;i<m;i++){
      System.out.print(secondStringArray[i] + " ");
    }
  }

  private void startProcess(){

    for (int i=1;i<n;i++){
      c[i][0]=0;
    }
    for (int i=1;i<m;i++){
      c[0][i]=0;
    }


    for (int i=1;i<n;i++){
      for (int j=1;j<m;j++){
        if (firstStringArray[i]==secondStringArray[j]){
          c[i][j]=c[i-1][j-1]+1;
        }
        else if (c[i-1][j]>=c[i][j-1]){
          c[i][j]=c[i-1][j];
        }
        else {
          c[i][j]=c[i][j-1];
        }
      }
    }
  }

  public void print(){
    for (int i=0;i<n;i++){
      System.out.print("\n");
      for (int j=0;j<m;j++){
        System.out.print(c[i][j] + " ");
      }
    }
  }
}

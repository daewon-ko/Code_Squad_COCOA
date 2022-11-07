package chapter7.array.alone;

public class twoDimensionArray {
    public static void main(String[] args) {
        System.out.println((int)'a');
        System.out.println((int)'z');

        char [][] alpabets = new char[13][2];

        // alphabet을 반복문을 통해서 할당을 어떻게 간편하게 할 수 있을까?
        for(int  i=0; i<alpabets.length; i++){
            for(int j=0; j<alpabets[i].length; j++){

                alpabets[i][j] = (char)(i+j+97);
                //(1,2) = (2,1)이 되어버린다 위와 같은 식이면!
                // 어떻게 구성해줘야할까? 위의 문제점을 해결하려면?

            };
        }

        for(int i=0; i<alpabets.length; i++){
            for(int j=0; j<alpabets[i].length; j++){
                // a,b
                // c,d
                // ...
                // y,z
                // 같은형식으로 두번째 인자에서 ,를 빼주고 출력은 어떻게?
                // for문 내에서 또 if문을? 그렇게 작성하면 가독성이 너무 떨어지고
                // depth가 너무 깊어지지 않나?
                if(j==0){
                    System.out.print(alpabets[i][j]+", ");
                }else{
                    System.out.print(alpabets[i][j]+"\n");

                }
            }
        }

    }
    // a ~ z : 97~ 122

}

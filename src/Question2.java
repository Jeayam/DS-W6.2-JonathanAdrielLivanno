import java.util.*;

public class Question2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(input.hasNextInt()){

            int n = input.nextInt();

            Stack<Integer> stack = new Stack<>();
            Queue<Integer> queue = new LinkedList<>();
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

            boolean isStack = true;
            boolean isQueue = true;
            boolean isPQ = true;

            for(int i = 0; i < n; i++){

                int type = input.nextInt();
                int val = input.nextInt();

                if(type == 1){

                    stack.push(val);
                    queue.add(val);
                    pq.add(val);

                } 
                else if(type == 2){

                    if(stack.isEmpty() || stack.pop() != val){
                        isStack = false;
                    }

                    if(queue.isEmpty() || queue.poll() != val){
                        isQueue = false;
                    }

                    if(pq.isEmpty() || pq.poll() != val){
                        isPQ = false;
                    }
                }
            }

            int count = 0;
            if(isStack) count++;
            if(isQueue) count++;
            if(isPQ) count++;

            if(count == 0){
                System.out.println("tidak ada");
            }
            else if(count > 1){
                System.out.println("tidak yakin");
            }
            else{
                if(isStack) System.out.println("stack");
                if(isQueue) System.out.println("queue");
                if(isPQ) System.out.println("priority queue");
            }
        }
    }
}
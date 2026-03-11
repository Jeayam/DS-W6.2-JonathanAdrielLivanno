import java.util.*;

public class Question1 {

    static class Letter {
        String name;
        int duration;
        int priority;

        Letter(String name, int duration, int priority) {
            this.name = name;
            this.duration = duration;
            this.priority = priority;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();

        if(n <= 0 || n > 100){
            System.out.println("Invalid number of letters");
            return;
        }

        List<Letter> list = new ArrayList<>();

        for(int i = 0; i < n; i++){

            String name = input.next();
            int duration = input.nextInt();
            int priority = input.nextInt();

            if(duration < 1 || duration > 100){
                System.out.println("Invalid duration");
                return;
            }

            if(priority < 0 || priority > 100){
                System.out.println("Invalid priority");
                return;
            }

            list.add(new Letter(name, duration, priority));
        }

        // sort priority kecil dulu
        list.sort((a,b) -> a.priority - b.priority);

        Queue<Letter> queue = new LinkedList<>();

        for(Letter l : list){
            queue.add(l);
        }

        int time = 0;

        while(!queue.isEmpty()){

            Letter current = queue.poll();

            time += current.duration;

            System.out.print(time + " ");

            // pending
            for(Letter l : queue){
                System.out.print(l.name + " ");
            }

            System.out.print("| " + current.name + " | sent");

            System.out.println();
        }

    }
}
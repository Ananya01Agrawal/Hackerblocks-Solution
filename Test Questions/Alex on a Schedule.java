public class Alex_on_a_Schedule {
        public static void main (String args[]) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }
            int distance = sc.nextInt();
            System.out.println(possible_Ways(arr , distance));
        }

        static int possible_Ways(int[] arr , int d){
            HashSet<Integer> set = new HashSet<>();
            for(int i = 0 ; i < arr.length ; i++){
                set.add(arr[i]);
            }
            arr = new int[set.size()];
            int p = 0;
            for(int i : set){
                arr[p++] = i;
            }

            int count = 0;

            Arrays.sort(arr);
            for(int i = 0 ; i < arr.length-1 ; i++){
                for(int j = 0 ; j < arr.length ; j++){
                    if(arr[j] - arr[i] == d){
                        count++;
                    }
                }
            }

            return count;
        }
}


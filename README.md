# Floyd-Warshall-Algorithm || ফ্লয়েড-ওয়ারশাল অ্যালগরিদম
###### বিস্তারিত তথ্য

ফ্লয়েড-ওয়ারশাল অ্যালগরিদম হল একটি ওজনযুক্ত গ্রাফে সমস্ত জোড়া শীর্ষবিন্দুর মধ্যে সংক্ষিপ্ততম পথ খুঁজে বের করার জন্য একটি অ্যালগরিদম। 
এই অ্যালগরিদম নির্দেশিত এবং অনির্দেশিত ওজনযুক্ত গ্রাফ উভয়ের জন্য কাজ করে। কিন্তু, এটি ঋণাত্মক চক্রের গ্রাফগুলির জন্য কাজ করে না (যেখানে একটি চক্রের প্রান্তের যোগফল ঋণাত্মক)।
একটি ওজনযুক্ত গ্রাফ হল একটি গ্রাফ যার প্রতিটি প্রান্তের সাথে একটি সংখ্যাসূচক মান যুক্ত থাকে।
ফ্লয়েড-ওয়ারশ্যাল অ্যালগরিদমকে ফ্লয়েডের অ্যালগরিদম, রয়-ফ্লয়েড অ্যালগরিদম, রয়-ওয়ারশাল অ্যালগরিদম বা WFI অ্যালগরিদম নামেও ডাকা হয়।
এই অ্যালগরিদমটি সংক্ষিপ্ততম পথগুলি খুঁজে পেতে গতিশীল প্রোগ্রামিং পদ্ধতি অনুসরণ করে।
*** 
##### কিভাবে Floyd-Warshall অ্যালগরিদম কাজ করে ?
প্রদত্ত গ্রাফে ফোকাস করুন <br>
![ezgif com-gif-maker](https://user-images.githubusercontent.com/27882232/214534128-1f0e805c-e8c8-41aa-a17b-97329c9f21ef.jpg)

১। সমস্ত জোড়া শীর্ষবিন্দুর মধ্যে সংক্ষিপ্ততম পথ খুঁজে পেতে নীচের পদক্ষেপগুলি অনুসরণ করুন৷

n*n মাত্রার একটি ম্যাট্রিক্স ```Ao``` তৈরি করুন যেখানে n হল শীর্ষবিন্দুর সংখ্যা। সারি এবং কলাম যথাক্রমে i এবং j হিসাবে সূচিত করা হয়েছে। i এবং j হল গ্রাফের শীর্ষবিন্দু।

প্রতিটি কক্ষ A[i][j] i তম শীর্ষবিন্দু থেকে j তম শীর্ষবিন্দু পর্যন্ত দূরত্ব দিয়ে পূর্ণ। i তম শীর্ষবিন্দু থেকে j তম শীর্ষবিন্দু পর্যন্ত কোন পথ না থাকলে, কোষটিকে অসীম হিসাবে ছেড়ে দেওয়া হয়। <br>
![ezgif com-gif-maker (1)](https://user-images.githubusercontent.com/27882232/214535481-25b85228-b6b3-49b5-ae99-87911d22c282.jpg)

২। এখন, ম্যাট্রিক্স A0 ব্যবহার করে একটি ম্যাট্রিক্স A1 তৈরি করুন। প্রথম কলাম এবং প্রথম সারির উপাদানগুলি যেমন আছে তেমনই রেখে দেওয়া হয়েছে। অবশিষ্ট কোষগুলি নিম্নলিখিত উপায়ে পূরণ করা হয়।
উৎস থেকে গন্তব্যে যাওয়ার সংক্ষিপ্ততম পথে k হল মধ্যবর্তী শীর্ষবিন্দু। <br>

এই ধাপে, k হল প্রথম শীর্ষবিন্দু। A[i][j] (A[i][k] + A[k][j]) দিয়ে পূর্ণ হয় যদি (A[i][j] > A[i][k] + A[k][ j])। <br> 

অর্থাৎ, উৎস থেকে গন্তব্যের সরাসরি দূরত্ব যদি k শীর্ষবিন্দুর পথের চেয়ে বেশি হয়, তাহলে ঘরটি A[i][k] + A[k][j] দিয়ে পূর্ণ হবে। <br>

এই ধাপে, k হল শীর্ষবিন্দু 1। আমরা এই শীর্ষবিন্দু k এর মাধ্যমে উৎস শীর্ষবিন্দু থেকে গন্তব্য শীর্ষবিন্দু পর্যন্ত দূরত্ব গণনা করি। <br>

উদাহরণস্বরূপ: A1[2, 4]-এর জন্য, শীর্ষবিন্দু 2 থেকে 4 থেকে সরাসরি দূরত্ব হল 4 এবং শীর্ষবিন্দু 2 থেকে 4 শীর্ষবিন্দুর মধ্য দিয়ে (অর্থাৎ শীর্ষবিন্দু 2 থেকে 1 এবং শীর্ষবিন্দু 1 থেকে 4 পর্যন্ত) দূরত্বের সমষ্টি হল 7. যেহেতু 4 < 7, A0[2, 4] 4 দিয়ে পূর্ণ। <br>
![ezgif com-gif-maker (2)](https://user-images.githubusercontent.com/27882232/214536540-33b37d78-be0a-4d09-9cc9-c45143fdf4bd.jpg)

৩। একইভাবে, A1 ব্যবহার করে A2 তৈরি করা হয়েছে। দ্বিতীয় কলাম এবং দ্বিতীয় সারির উপাদানগুলি যেমন আছে তেমনই রেখে দেওয়া হয়েছে।

এই ধাপে, k হল দ্বিতীয় শীর্ষবিন্দু (অর্থাৎ শীর্ষবিন্দু 2)। অবশিষ্ট ধাপগুলি ধাপ 2 এর মতোই।
![ezgif com-gif-maker (3)](https://user-images.githubusercontent.com/27882232/214536897-d25cd250-a75a-4b0e-b936-59fd96bfca18.jpg)

৪। একইভাবে A3 এবং A4 ও তৈরি হয়।

![ezgif com-gif-maker (4)](https://user-images.githubusercontent.com/27882232/214537376-9602deb3-c8fe-4066-9803-6ede53561d68.jpg)

A4 প্রতিটি জোড়া শীর্ষবিন্দুর মধ্যে সবচেয়ে ছোট পথ দেয়।
![ezgif com-gif-maker (5)](https://user-images.githubusercontent.com/27882232/214537528-f5f572d6-7a55-4e6a-b879-11d55a321548.jpg)
```
n = no of vertices
A = matrix of dimension n*n
for k = 1 to n
    for i = 1 to n
        for j = 1 to n
            Ak[i, j] = min (Ak-1[i, j], Ak-1[i, k] + Ak-1[k, j])
return A
```
***
### A java code program that implements the Floyd-Warshall algorithm to find the shortest paths between all pairs of vertices in a weighted, directed graph

```
import java.util.Scanner;

public class FloydWarshall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of vertices:");
        int n = scanner.nextInt();
        System.out.println("Enter the number of edges:");
        int e = scanner.nextInt();
        int[][] p = new int[10][10];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                p[i][j] = 999;
            }
        }

        for (int i = 1; i <= e; i++) {
            System.out.println("Enter the end vertices of edge" + i + " with its weight");
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            p[u][v] = w;
        }

        System.out.println("Matrix of input data:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(p[i][j] + "\t");
            }
            System.out.println();
        }

        floyds(p, n);

        System.out.println("Transitive closure:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(p[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("The shortest paths are:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i != j) {
                    System.out.println("<" + i + "," + j + ">=" + p[i][j]);
                }
            }
        }
    }

    public static void floyds(int[][] p, int n) {
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == j) {
                        p[i][j] = 0;
                    } else {
                        p[i][j] = Math.min(p[i][j], p[i][k] + p[k][j]);
                    }
                }
            }
        }
    }
}

```

#### Output: 
```
Enter the number of vertices:
3
Enter the number of edges:
4
Enter the end vertices of edge1 with its weight
5
4
5
Enter the end vertices of edge2 with its weight
2
3
4
Enter the end vertices of edge3 with its weight
5
5
6
Enter the end vertices of edge4 with its weight
4
5
6
Matrix of input data:
999	999	999	
999	999	4	
999	999	999	
Transitive closure:
0	999	999	
999	0	4	
999	999	0	
The shortest paths are:
<1,2>=999
<1,3>=999
<2,1>=999
<2,3>=4
<3,1>=999
<3,2>=999

```

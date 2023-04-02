public class MainActivity extends AppCompatActivity {
    private final String LIST_KEY = "LIST_KEY";

    private ArrayList<String> mStrings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            mStrings = new ArrayList<>();
            mStrings.add("First line");
            mStrings.add("Second line");
            mStrings.add("Third line");
        } else {
            mStrings = savedInstanceState.getStringArrayList(LIST_KEY);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putStringArrayList(LIST_KEY, mStrings);
    }
}

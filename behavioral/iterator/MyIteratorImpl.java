package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class MyIteratorImpl implements MyIterator {
    private List<User> userList = new ArrayList<>();

    private int length;
    private int position;

    public MyIteratorImpl(List<User> userList) {
        this.userList = userList;
        this.length = userList.size();
    }

    @Override
    public boolean hasNext() {
        if (position < length)
            return true;
        else
            return false;
    }

    @Override
    public User next() {
        User user = userList.get(position);
        position++;
        return user;
    }
}

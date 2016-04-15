package client.inventory;

public enum ItemFlag {

    LOCK(0x01),
    SPIKES(0x02), //???
    KARMA_USE(0x02), //???
    COLD(0x04),
    UNTRADEABLE(0x08),
    KARMA_EQ(0x10), // send this to cs items and become tradable?
    CHARM_EQUIPPED(0x20),
    ANDROID_ACTIVATED(0x40),
    CRAFTED(0x80), 
    CRAFTED_USE(0x10), //da fuq?  KARMA_EQ is 0x10
    SHIELD_WARD(0x100), //shield icon
    LUCKS_KEY(0x200), //this has some clover leaf thing at bottomleft
    KARMA_ACC_USE(0x400),
    //0x800
    KARMA_ACC(0x1000),
    SLOTS_PROTECT(0x2000), // Upgrade count protection
    SCROLL_PROTECT(0x4000); // scroll protection
    //There are probably other flags, maybe, possibly.
    private final int i;

    private ItemFlag(int i) {
        this.i = i;
    }

    public final int getValue() {
        return i;
    }

    public final boolean check(int flag) {
        return (flag & i) == i;
    }
}

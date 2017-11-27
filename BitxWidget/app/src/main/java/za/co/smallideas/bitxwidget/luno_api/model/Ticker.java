package za.co.smallideas.bitxwidget.luno_api.model;

/**
 * Created by nealderman on 2017/11/24.
 */

public class Ticker {
    public long timestamp;
    public String currency;
    public double bid;
    public double ask;
    public double lastTrade;
    @SerializedName("rolling_24_hour_volume")
    public double rolling24HourVolume;
}

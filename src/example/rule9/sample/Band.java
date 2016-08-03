package example.rule9.sample;

class Band {
}

class BandInfo {
    String bandname;
    int bandCreateYear;
    int bandType;
    int musicType;

    BandInfo(String bandname, int bandCreateYear, int bandType, int musicType) {
        this.bandname = bandname;
        this.bandCreateYear = bandCreateYear;
        this.bandType = bandType;
        this.musicType = musicType;
    }

    String getBandname() {
        return bandname;
    }

    int getBandCreateYear() {
        return bandCreateYear;
    }

    int getBandType() {
        return bandType;
    }

    @Override
    public String toString() {
        return "BandInfo [bandname=" + bandname + ", bandCreateYear="
                + bandCreateYear + ", bandType=" + bandType + "]";
    }
}

class BandTypeService {
    final static int BOYS = 1;
    final static int GIRLS = 2;

    String getBandTypeValue(BandInfo bandInfo){
        int bandType = bandInfo.getBandType();
        switch(bandType){
            case BOYS:
                return "ボーイズバンド";
            case GIRLS:
                return "ガールズバンド";
            default:
                return "混声";
        }
    }
}

class MusicGenreService {
    final static int ROCK = 1;
    final static int HEAVY_METAL = 2;
    final static int BLUES = 3;
    final static int POP = 4;
    final static int CLASSIC = 5;
    final static int R_AND_B = 6;
    final static int ANIME = 7;
    final static int REGGAE = 8;
    final static int TANGO = 9;

    String getMusicGenreValue(BandInfo bandInfo){
        int bandType = bandInfo.getBandType();
        switch(bandType){
            case ROCK:
                return "ロック";
            case HEAVY_METAL:
                return "ヘビメタ";
            case BLUES:
                return "ブルース";
            case POP:
                return "ポップ";
            case CLASSIC:
                return "クラッシク";
            case R_AND_B:
                return "R&B";
            case ANIME:
                return "アニソン";
            case REGGAE:
                return "レゲエ";
            case TANGO:
                return "タンゴ";
            default:
                return "歌";
        }
    }
}
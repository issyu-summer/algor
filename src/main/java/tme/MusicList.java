package tme;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
@Data
public class MusicList {

    private String name;
    private Integer score;
    private List<Music> musicList;
    private PriorityQueue<Music> queue;
    int size;
    public MusicList(String name,List<Music> musics){
        this.musicList=musics;
        this.name=name;
        this.size=0;
        queue= new PriorityQueue<>((m1,m2)->(m2.getScore()-m1.getScore()));
    }

    private void addMusic(Music music){
        musicList.add(music);
        size++;
        if(queue.size()<1){
            queue.add(music);
        }else {
            if(queue.peek().getScore()<music.getScore()){
                queue.poll();
                queue.offer(music);
            }
        }
        this.score=queue.peek().getScore()*size;
    }

    private boolean isHot(){
        return this.score>100;
    }

    int hold=100;
    public  List<MusicList> generateHot(List<Music> musics){
        musics = musics.stream().sorted((m1, m2) -> m2.getScore() - m1.getScore()).collect(Collectors.toList());
        int s;
//        if(musics.size()==1){
//            if((s=musics.get(0).getScore())<hold){
//                return new ArrayList<>();
//            }else {
//                return new ArrayList<MusicList>(){{
//                    addMusic();
//                }}
//            }
//        }
        List<MusicList> hotLists=new ArrayList<>();
        int l=0,r= musics.size() -1;
        Music music;
        int remain=musics.size();
        while (l<r){
            if(remain<=0){
                break;
            }
            int c=hold/(music=musics.get(l)).getScore();
            int rIndex=r;
            r-=c-1;
            Music finalMusic = music;
            List<Music> tmp=new ArrayList<>(){{
                add(finalMusic);
            }};
            remain--;
            for (int i =rIndex; i>=r; i--) {
                tmp.add(musics.get(i));
                remain--;
            }
            l++;
            hotLists.add(new MusicList("musicList"+l,tmp));
        }
        return hotLists;
    }
}

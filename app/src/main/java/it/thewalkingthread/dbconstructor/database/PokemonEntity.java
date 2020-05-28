package it.thewalkingthread.dbconstructor.database;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;
import androidx.room.Relation;
import it.thewalkingthread.dbconstructor.model.Pokemon;


@Entity
public class PokemonEntity implements Parcelable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="pokeId")
    int idPoke;

    @ColumnInfo(name="name")
    String name;


    protected PokemonEntity(Parcel in) {
        idPoke = in.readInt();
        name = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(idPoke);
        dest.writeString(name);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<PokemonEntity> CREATOR = new Creator<PokemonEntity>() {
        @Override
        public PokemonEntity createFromParcel(Parcel in) {
            return new PokemonEntity(in);
        }

        @Override
        public PokemonEntity[] newArray(int size) {
            return new PokemonEntity[size];
        }
    };
}

/*
@Entity(primaryKeys = {"poke", "type"})
class PokemonType {
    int id;
    PokeTypeEntity type;
}

 */


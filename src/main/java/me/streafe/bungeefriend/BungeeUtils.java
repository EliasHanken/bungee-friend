package me.streafe.bungeefriend;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;

import java.util.Collection;

public class BungeeUtils {

    public static void sendCustomData(ProxiedPlayer player, String data1, int data2){
        Collection<ProxiedPlayer> networkPlayers = ProxyServer.getInstance().getPlayers();

        if(networkPlayers == null || networkPlayers.isEmpty()){
            return;
        }

        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        out.writeUTF("MySubChannel");
        out.writeUTF(data1);
        out.writeInt(data2);

        player.getServer().getInfo().sendData("my:channel",out.toByteArray());
    }
}

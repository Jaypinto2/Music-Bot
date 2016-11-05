package xyz.gnarbot.gnar.fakes

import net.dv8tion.jda.entities.Message
import net.dv8tion.jda.entities.impl.TextChannelImpl

object FakeTextChannel : TextChannelImpl("000000000000000000", FakeGuild)
{
    override fun sendMessage(msg : String) : Message
    {
        FakeBot.LOG.info(msg)
        return FakeMessage.create(msg)
    }
    
    override fun sendMessage(msg : Message) : Message
    {
        return sendMessage(msg.content)
    }
}
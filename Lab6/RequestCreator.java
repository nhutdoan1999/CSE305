abstract class RequestCreator {
    public abstract RequestProduct createRequest();

    public void processRequest() {
        RequestProduct request = createRequest();
        request.processRequest();
    }
}

class LowPriorityConcreteCreator extends RequestCreator {
    @Override
    public RequestProduct createRequest() {
        LowPriorityConcrete request = new LowPriorityConcrete();
        request.setPriority(null);
        request.setExpire(null);
        request.setStatus(null);
        return request;
    }
}

class MidPriorityConcreteCreator extends RequestCreator {
    @Override
    public RequestProduct createRequest() {
        MidPriorityConcrete request = new MidPriorityConcrete();
        request.setPriority(null);
        request.setExpire(null);
        request.setStatus(null);
        return request;
    }
}

class HighPriorityConcreteCreator extends RequestCreator {
    @Override
    public RequestProduct createRequest() {
        HighPriorityConcrete request = new HighPriorityConcrete();
        request.setPriority(null);
        request.setExpire(null);
        request.setStatus(null);
        return request;
    }
}

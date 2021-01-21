package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.CommunicationEndPoint_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("1bd630f3-4144-429d-8774-d4b7813d55de")
public class HwEndPoint_Instance extends CommunicationEndPoint_Instance {
    @objid ("342583a2-e60e-4f86-82f3-dfd615caa309")
    public HwEndPoint_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWENDPOINT_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwEndPoint_Instance"));
    }

    @objid ("59352d62-a010-4b90-8c4c-9a8ed35ceeab")
    public HwEndPoint_Instance(Instance element) {
        super(element);
    }

    @objid ("6f13f1fd-82b5-4d74-a3a8-52baf872b45c")
    public String getconnectedTo() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWENDPOINT_INSTANCE_HWENDPOINT_INSTANCE_CONNECTEDTO, this.element);
    }

    @objid ("230ad106-0758-4c45-8244-e33af9c62ff4")
    public void setconnectedTo(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWENDPOINT_INSTANCE_HWENDPOINT_INSTANCE_CONNECTEDTO, value);
    }

}

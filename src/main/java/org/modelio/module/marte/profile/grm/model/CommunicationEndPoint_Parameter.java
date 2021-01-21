package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("833dabb4-d79c-43c7-8024-9106aedb7476")
public class CommunicationEndPoint_Parameter {
    @objid ("56c0704a-7a24-4317-b0f6-df26c1de1654")
    protected Parameter element;

    @objid ("7429bb20-e628-45e0-bc9f-3b8057f71602")
    public CommunicationEndPoint_Parameter() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMMUNICATIONENDPOINT_PARAMETER);
        this.element.setName(MARTEResourceManager.getName("CommunicationEndPoint_Parameter"));
    }

    @objid ("f9ed97c2-b9c1-4cbf-b0c4-2180f9c0f863")
    public CommunicationEndPoint_Parameter(final Parameter element) {
        this.element = element;
    }

    @objid ("7b124089-9d34-42ea-a472-6779d59e2144")
    public Parameter getElement() {
        return this.element;
    }

    @objid ("2cb622eb-a854-4590-8ecd-146cb9dda0ba")
    public void setParent(final Operation parent) {
        this.element.setComposed(parent);
    }

    @objid ("55941b94-fc23-466f-bb79-a4a73093465f")
    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("d3dc073a-e863-4156-b9d7-45fa55f938f3")
    public String getpacketSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_PARAMETER_COMMUNICATIONENDPOINT_PARAMETER_PACKETSIZE, this.element);
    }

    @objid ("2e7b6b81-5fd9-496f-930c-e2654395341f")
    public void setpacketSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_PARAMETER_COMMUNICATIONENDPOINT_PARAMETER_PACKETSIZE, value);
    }

}

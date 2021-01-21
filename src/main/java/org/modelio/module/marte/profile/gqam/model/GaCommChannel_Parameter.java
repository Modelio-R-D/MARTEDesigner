package org.modelio.module.marte.profile.gqam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.SchedulableResource_Parameter;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("0ed05ea9-9141-40af-b0ce-de232ae03d42")
public class GaCommChannel_Parameter extends SchedulableResource_Parameter {
    @objid ("664d5ce6-46bc-439c-b479-8233b69a6110")
    public GaCommChannel_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GACOMMCHANNEL_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("GaCommChannel_Parameter"));
    }

    @objid ("26ed188b-5584-40ec-9141-f96bbd722ca4")
    public GaCommChannel_Parameter(Parameter element) {
        super(element);
    }

    @objid ("46fe9242-fd6f-420d-afc9-f3b1421ac08e")
    public String getpacketSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_PARAMETER_GACOMMCHANNEL_PARAMETER_PACKETSIZE, this.element);
    }

    @objid ("aaf5fb48-7613-4f85-8425-b6b3b561bea4")
    public void setpacketSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMCHANNEL_PARAMETER_GACOMMCHANNEL_PARAMETER_PACKETSIZE, value);
    }

    @objid ("68ea3b4b-0f71-45aa-b9bb-314ae4c3622b")
    public String getutlization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_PARAMETER_GACOMMCHANNEL_PARAMETER_UTILIZATION, this.element);
    }

    @objid ("abf81848-67ee-42db-85d8-16db44c8e433")
    public void setutlization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMCHANNEL_PARAMETER_GACOMMCHANNEL_PARAMETER_UTILIZATION, value);
    }

}

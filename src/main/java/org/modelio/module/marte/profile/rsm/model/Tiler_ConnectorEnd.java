package org.modelio.module.marte.profile.rsm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.ConnectorEnd;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("7c4601af-d5f4-4fc9-80a6-c24fe0a87a2b")
public class Tiler_ConnectorEnd {
    @objid ("00134fdc-1fe2-47e9-8f1d-3adfc2e31d49")
    protected ConnectorEnd element;

    @objid ("ae0a2a41-93c3-468a-8b35-8413ffa610f2")
    public Tiler_ConnectorEnd() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConnectorEnd();
        ModelUtils.setStereotype(this.element,"Tiler_ConnectorEnd");
        this.element.setName(MARTEResourceManager.getName("Tiler_ConnectorEnd"));
    }

    @objid ("4b8a38f3-3586-43dd-b967-f95de78a434e")
    public Tiler_ConnectorEnd(ConnectorEnd element) {
        this.element = element;
    }

    @objid ("6c8a9a4e-3ad5-4064-93fe-37bb75295621")
    public ConnectorEnd getElement() {
        return this.element;
    }

    @objid ("f81e87f0-a8b4-4055-837b-9c97330dbb60")
    public void setParent(Link parent) {
        this.element.setLink(parent);
    }

    @objid ("40e921f4-527f-449d-8854-71030097649f")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("50ccd98b-9db2-4865-a1a9-025c94993245")
    public String getorigin() {
        return ModelUtils.getTaggedValue("Tiler_ConnectorEnd_origin", this.element);
    }

    @objid ("bad99391-45ff-4fbb-93e7-df4652b9b66c")
    public void setorigin(String value) {
        ModelUtils.addStringValue(this.element,"Tiler_ConnectorEnd_origin", value);
    }

    @objid ("ce19e55f-d538-41c1-98e8-685ff4748b1a")
    public String getpaving() {
        return ModelUtils.getTaggedValue("Tiler_ConnectorEnd_paving", this.element);
    }

    @objid ("27dd6cb6-a710-4e7a-b661-06b5a7f0055a")
    public void setpaving(String value) {
        ModelUtils.addStringValue(this.element,"Tiler_ConnectorEnd_paving", value);
    }

    @objid ("d9435092-46ea-48e1-a466-6f33edf1c1f2")
    public String getfitting() {
        return ModelUtils.getTaggedValue("Tiler_ConnectorEnd_fitting", this.element);
    }

    @objid ("5df1f008-ca99-465c-bf82-bea32e460571")
    public void setfitting(String value) {
        ModelUtils.addStringValue(this.element,"Tiler_ConnectorEnd_fitting", value);
    }

    @objid ("ca7baf6c-717f-467b-ac72-b704479a3984")
    public String gettiler() {
        return ModelUtils.getTaggedValue("Tiler_ConnectorEnd_tiler", this.element);
    }

    @objid ("599ce3aa-4352-4609-b618-bd102050ad04")
    public void settiler(String value) {
        ModelUtils.addStringValue(this.element,"Tiler_ConnectorEnd_tiler", value);
    }

}

package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("78a38374-d8e6-4802-9d00-700d50ab7cd1")
public class CommunicationMedia_AssociationEnd extends ProcessingResource_AssociationEnd {
    @objid ("9db8c848-0ea3-4812-9884-a6d0dbe678bd")
    public CommunicationMedia_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMMUNICATIONMEDIA_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("CommunicationMedia_AssociationEnd"));
    }

    @objid ("3694f7f0-870e-4539-8c2d-d0001dc02720")
    public CommunicationMedia_AssociationEnd(final AssociationEnd element) {
        super(element);
    }

    @objid ("661500e7-ef16-421f-a145-7f4e519dc596")
    public String getelementSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_ELEMENTSIZE, this.element);
    }

    @objid ("fac31a46-2687-4d91-99f5-20f0d94ccefd")
    public void setelementSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_ELEMENTSIZE, value);
    }

    @objid ("aacf07e3-fa79-4d9a-95a9-d490ec17683f")
    public String gettransmMode() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_TRANSMMODE, this.element);
    }

    @objid ("84e380e4-fe80-4c36-8b7a-daeabf757904")
    public void settransmMode(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_TRANSMMODE, value);
    }

    @objid ("e0ff06ef-129c-412d-8594-fffbfaa3e73b")
    public String getblockT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_BLOCKT, this.element);
    }

    @objid ("a3badcdf-35a8-40cb-bb82-fe46bc22ee85")
    public void setblockT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_BLOCKT, value);
    }

    @objid ("7e01a0ec-8070-4cd7-b43b-4551f4259204")
    public String getpacketT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_PACKETT, this.element);
    }

    @objid ("ff870284-1199-4f3c-bc20-f37632333ea6")
    public void setpacketT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_PACKETT, value);
    }

    @objid ("f9698091-ef0b-44ce-8073-9384024ab831")
    public String getcapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_CAPACITY, this.element);
    }

    @objid ("5cc3c078-5679-462e-9a8b-2e5d676327ab")
    public void setcapacity(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_CAPACITY, value);
    }

}

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_pam.standard.associationend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.ResourceAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << PaLogicalResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("0f353145-b75c-4551-a1e2-41b942893e16")
public class PaLogicalResourceAssociationEnd extends ResourceAssociationEnd {
    @objid ("33a0eb06-7a2e-49cb-b99b-747209b9a190")
    public static final String STEREOTYPE_NAME = "PaLogicalResource_AssociationEnd";

    @objid ("027cc7ca-7740-4c93-aa30-e7cc4440c27d")
    public static final String PALOGICALRESOURCE_ASSOCIATIONEND_POOLSIZE_TAGTYPE = "PaLogicalResource_AssociationEnd_poolSize";

    @objid ("d593db10-a50b-4c87-b788-9be539b4aaec")
    public static final String PALOGICALRESOURCE_ASSOCIATIONEND_THROUGHPUT_TAGTYPE = "PaLogicalResource_AssociationEnd_throughput";

    @objid ("1a58da93-408e-4627-8e3e-780b43a0464b")
    public static final String PALOGICALRESOURCE_ASSOCIATIONEND_UTILIZATION_TAGTYPE = "PaLogicalResource_AssociationEnd_utilization";

    /**
     * Tells whether a {@link PaLogicalResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << PaLogicalResource_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("1efab799-e5e7-42c1-ae7c-b302a5f71236")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PaLogicalResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << PaLogicalResource_AssociationEnd >> then instantiate a {@link PaLogicalResourceAssociationEnd} proxy.
     * 
     * @return a {@link PaLogicalResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("6cec1095-a909-485f-b892-96b93c7ead4e")
    public static PaLogicalResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, PaLogicalResourceAssociationEnd.STEREOTYPE_NAME);
        return PaLogicalResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link PaLogicalResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << PaLogicalResource_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link PaLogicalResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("d2b287ae-5c78-44ea-8bfe-f03a907a1b6d")
    public static PaLogicalResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return PaLogicalResourceAssociationEnd.canInstantiate(obj) ? new PaLogicalResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PaLogicalResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << PaLogicalResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link PaLogicalResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ec07ce0e-da56-4c66-850d-3ca015dd96f6")
    public static PaLogicalResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (PaLogicalResourceAssociationEnd.canInstantiate(obj))
        	return new PaLogicalResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("PaLogicalResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c445c602-0b50-49c0-9a97-082e53632abf")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        PaLogicalResourceAssociationEnd other = (PaLogicalResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("6479c6c1-0ee1-41e4-9ce1-3ba1ba306d66")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'PaLogicalResource_AssociationEnd_poolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0655700b-2175-4d8b-bece-37230e81e6c4")
    public String getPaLogicalResource_AssociationEnd_poolSize() {
        return this.elt.getTagValue(PaLogicalResourceAssociationEnd.MdaTypes.PALOGICALRESOURCE_ASSOCIATIONEND_POOLSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaLogicalResource_AssociationEnd_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("02a8b605-9e26-4f20-ba36-4fd1d7f682ca")
    public String getPaLogicalResource_AssociationEnd_throughput() {
        return this.elt.getTagValue(PaLogicalResourceAssociationEnd.MdaTypes.PALOGICALRESOURCE_ASSOCIATIONEND_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaLogicalResource_AssociationEnd_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1f0420dc-0f0e-40c8-9524-15471f409b8f")
    public String getPaLogicalResource_AssociationEnd_utilization() {
        return this.elt.getTagValue(PaLogicalResourceAssociationEnd.MdaTypes.PALOGICALRESOURCE_ASSOCIATIONEND_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("f579db8d-00d4-4837-8414-f0d583c9f44d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'PaLogicalResource_AssociationEnd_poolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3d07aa65-e901-4ee1-a4a5-38a1656efcb7")
    public void setPaLogicalResource_AssociationEnd_poolSize(final String value) {
        this.elt.putTagValue(PaLogicalResourceAssociationEnd.MdaTypes.PALOGICALRESOURCE_ASSOCIATIONEND_POOLSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaLogicalResource_AssociationEnd_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cd522bf0-05ce-425c-8173-5dc74f6e1b17")
    public void setPaLogicalResource_AssociationEnd_throughput(final String value) {
        this.elt.putTagValue(PaLogicalResourceAssociationEnd.MdaTypes.PALOGICALRESOURCE_ASSOCIATIONEND_THROUGHPUT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaLogicalResource_AssociationEnd_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a0b2cc33-49d8-4221-aabe-d704f2dd8ea2")
    public void setPaLogicalResource_AssociationEnd_utilization(final String value) {
        this.elt.putTagValue(PaLogicalResourceAssociationEnd.MdaTypes.PALOGICALRESOURCE_ASSOCIATIONEND_UTILIZATION_TAGTYPE_ELT, value);
    }

    @objid ("0dc049db-e379-4b68-8caf-ecd572123f65")
    protected PaLogicalResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("62aaa72b-e563-458b-9dda-3b5a2e030196")
    public static final class MdaTypes {
        @objid ("91fdd29b-cb38-4129-b60e-b6a57a11d309")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c8a58715-95ba-43a2-9673-1f1345573dde")
        public static TagType PALOGICALRESOURCE_ASSOCIATIONEND_UTILIZATION_TAGTYPE_ELT;

        @objid ("9dec76c4-53ee-4cc3-9ea7-f7e9409fd311")
        public static TagType PALOGICALRESOURCE_ASSOCIATIONEND_THROUGHPUT_TAGTYPE_ELT;

        @objid ("2969ed19-beb5-460f-808d-c80cc17c5641")
        public static TagType PALOGICALRESOURCE_ASSOCIATIONEND_POOLSIZE_TAGTYPE_ELT;

        @objid ("94f68902-e3e8-40d7-8a00-44f41cacdae5")
        private static Stereotype MDAASSOCDEP;

        @objid ("d583843b-35da-474d-8a54-32adb44be619")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cc414a46-bc77-4f0f-a2fe-6a544a4f2afb")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03d10552-0ccf-11df-8525-001302895b2b");
            PALOGICALRESOURCE_ASSOCIATIONEND_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d10559-0ccf-11df-8525-001302895b2b");
            PALOGICALRESOURCE_ASSOCIATIONEND_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d10560-0ccf-11df-8525-001302895b2b");
            PALOGICALRESOURCE_ASSOCIATIONEND_POOLSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d367a6-0ccf-11df-8525-001302895b2b");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}

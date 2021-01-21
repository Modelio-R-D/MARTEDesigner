/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.associationend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.associationend.SwResourceAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << SwInteractionResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b5adaac7-c944-4f0a-b035-f6301fef1d3c")
public class SwInteractionResourceAssociationEnd extends SwResourceAssociationEnd {
    @objid ("a0f5a31d-e531-4dbd-a32f-1b276141092e")
    public static final String STEREOTYPE_NAME = "SwInteractionResource_AssociationEnd";

    @objid ("69733221-1a4b-4697-8f9b-24ec03b02428")
    public static final String SWINTERACTIONRESOURCE_ASSOCIATIONEND_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE = "SwInteractionResource_AssociationEnd_isIntraMemoryPartitionInteraction";

    @objid ("fa798172-6326-4f89-8c59-7b24aa41da12")
    public static final String SWINTERACTIONRESOURCE_ASSOCIATIONEND_WAITINGPOLICYELEMENTS_TAGTYPE = "SwInteractionResource_AssociationEnd_waitingPolicyElements";

    @objid ("7290b2a8-a12a-4c95-830c-413157de7680")
    public static final String SWINTERACTIONRESOURCE_ASSOCIATIONEND_WAITINGQUEUECAPACITY_TAGTYPE = "SwInteractionResource_AssociationEnd_waitingQueueCapacity";

    @objid ("4b780f67-d2c4-4edc-8f10-89729c7a1595")
    public static final String SWINTERACTIONRESOURCE_ASSOCIATIONEND_WAITINGQUEUEPOLICY_TAGTYPE = "SwInteractionResource_AssociationEnd_waitingQueuePolicy";

    /**
     * Tells whether a {@link SwInteractionResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << SwInteractionResource_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b0358e2c-cd6d-43ae-be71-75c270091251")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwInteractionResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << SwInteractionResource_AssociationEnd >> then instantiate a {@link SwInteractionResourceAssociationEnd} proxy.
     * 
     * @return a {@link SwInteractionResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("f51408bf-55b3-4bd8-ba27-14588c89e97a")
    public static SwInteractionResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwInteractionResourceAssociationEnd.STEREOTYPE_NAME);
        return SwInteractionResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link SwInteractionResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SwInteractionResource_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link SwInteractionResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("71ed17c4-bb2e-462e-a110-0d4660456bea")
    public static SwInteractionResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return SwInteractionResourceAssociationEnd.canInstantiate(obj) ? new SwInteractionResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwInteractionResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SwInteractionResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link SwInteractionResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6ed9c44d-ef4f-488b-a84d-b98749003592")
    public static SwInteractionResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (SwInteractionResourceAssociationEnd.canInstantiate(obj))
        	return new SwInteractionResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("SwInteractionResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2d82660c-0fc7-43d6-b8e9-1596a4bc8be8")
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
        SwInteractionResourceAssociationEnd other = (SwInteractionResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("2b59157d-4d63-492b-be43-fedcb62ebad7")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwInteractionResource_AssociationEnd_waitingPolicyElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5e962985-8d77-4500-a931-c8a6002e3118")
    public List<String> getSwInteractionResource_AssociationEnd_waitingPolicyElements() {
        return this.elt.getTagValues(SwInteractionResourceAssociationEnd.MdaTypes.SWINTERACTIONRESOURCE_ASSOCIATIONEND_WAITINGPOLICYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwInteractionResource_AssociationEnd_waitingQueueCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("41159471-0c89-4af6-85c3-04df36699081")
    public String getSwInteractionResource_AssociationEnd_waitingQueueCapacity() {
        return this.elt.getTagValue(SwInteractionResourceAssociationEnd.MdaTypes.SWINTERACTIONRESOURCE_ASSOCIATIONEND_WAITINGQUEUECAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwInteractionResource_AssociationEnd_waitingQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bb3f762e-0a28-4273-b51c-665abf6cf11c")
    public String getSwInteractionResource_AssociationEnd_waitingQueuePolicy() {
        return this.elt.getTagValue(SwInteractionResourceAssociationEnd.MdaTypes.SWINTERACTIONRESOURCE_ASSOCIATIONEND_WAITINGQUEUEPOLICY_TAGTYPE_ELT);
    }

    @objid ("d0d18fc9-e953-4ca8-a470-dc9784ec8650")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwInteractionResource_AssociationEnd_isIntraMemoryPartitionInteraction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fa9ece3a-e4e3-47d8-8b72-f554ec096db4")
    public boolean isSwInteractionResource_AssociationEnd_isIntraMemoryPartitionInteraction() {
        return this.elt.isTagged(SwInteractionResourceAssociationEnd.MdaTypes.SWINTERACTIONRESOURCE_ASSOCIATIONEND_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SwInteractionResource_AssociationEnd_isIntraMemoryPartitionInteraction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("47fb936e-0cba-4477-95ee-dd71eccd443e")
    public void setSwInteractionResource_AssociationEnd_isIntraMemoryPartitionInteraction(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwInteractionResourceAssociationEnd.MdaTypes.SWINTERACTIONRESOURCE_ASSOCIATIONEND_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwInteractionResourceAssociationEnd.MdaTypes.SWINTERACTIONRESOURCE_ASSOCIATIONEND_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwInteractionResource_AssociationEnd_waitingPolicyElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("17ad3a1a-275a-4807-baa7-a2667ed4e49e")
    public void setSwInteractionResource_AssociationEnd_waitingPolicyElements(final List<String> values) {
        this.elt.putTagValues(SwInteractionResourceAssociationEnd.MdaTypes.SWINTERACTIONRESOURCE_ASSOCIATIONEND_WAITINGPOLICYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwInteractionResource_AssociationEnd_waitingQueueCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1482864e-f77b-4d4f-ac7f-95e984bbbd54")
    public void setSwInteractionResource_AssociationEnd_waitingQueueCapacity(final String value) {
        this.elt.putTagValue(SwInteractionResourceAssociationEnd.MdaTypes.SWINTERACTIONRESOURCE_ASSOCIATIONEND_WAITINGQUEUECAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwInteractionResource_AssociationEnd_waitingQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b3d78534-edb5-4569-93d1-88c35a93a015")
    public void setSwInteractionResource_AssociationEnd_waitingQueuePolicy(final String value) {
        this.elt.putTagValue(SwInteractionResourceAssociationEnd.MdaTypes.SWINTERACTIONRESOURCE_ASSOCIATIONEND_WAITINGQUEUEPOLICY_TAGTYPE_ELT, value);
    }

    @objid ("ee99699f-2183-4fad-be21-67824fd6ca41")
    protected SwInteractionResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("5b051073-990f-47d4-80c6-ee09e8ca8322")
    public static final class MdaTypes {
        @objid ("ec3fe037-9f00-4c36-83c0-dded67e3c9f7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6745a665-f590-4bb4-adec-de8504e2cdcf")
        public static TagType SWINTERACTIONRESOURCE_ASSOCIATIONEND_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT;

        @objid ("09b49dc9-8a4e-4fee-b055-7fd2463dc3e8")
        public static TagType SWINTERACTIONRESOURCE_ASSOCIATIONEND_WAITINGQUEUEPOLICY_TAGTYPE_ELT;

        @objid ("5a5b558c-965f-45b8-98e7-5a9e47815eba")
        public static TagType SWINTERACTIONRESOURCE_ASSOCIATIONEND_WAITINGQUEUECAPACITY_TAGTYPE_ELT;

        @objid ("55b92656-2574-4af4-9d2b-61f6f536f144")
        public static TagType SWINTERACTIONRESOURCE_ASSOCIATIONEND_WAITINGPOLICYELEMENTS_TAGTYPE_ELT;

        @objid ("bb499d9e-c8f4-4bac-92d8-c78c1b9bb85a")
        private static Stereotype MDAASSOCDEP;

        @objid ("7cbde0bc-57ef-47d5-9323-69c6f2c9cef0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d12716ee-dcb6-4ef2-bfbe-1b49a7c47cab")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "020c0c74-0ccf-11df-8525-001302895b2b");
            SWINTERACTIONRESOURCE_ASSOCIATIONEND_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020c0c7b-0ccf-11df-8525-001302895b2b");
            SWINTERACTIONRESOURCE_ASSOCIATIONEND_WAITINGQUEUEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020c0c82-0ccf-11df-8525-001302895b2b");
            SWINTERACTIONRESOURCE_ASSOCIATIONEND_WAITINGQUEUECAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020c0c89-0ccf-11df-8525-001302895b2b");
            SWINTERACTIONRESOURCE_ASSOCIATIONEND_WAITINGPOLICYELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020c0c90-0ccf-11df-8525-001302895b2b");
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

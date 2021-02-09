/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.associationend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
public class SwInteractionResourceAssociationEnd extends SwResourceAssociationEnd {
    public static final String STEREOTYPE_NAME = "SwInteractionResource_AssociationEnd";

    public static final String SWINTERACTIONRESOURCE_ASSOCIATIONEND_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE = "SwInteractionResource_AssociationEnd_isIntraMemoryPartitionInteraction";

    public static final String SWINTERACTIONRESOURCE_ASSOCIATIONEND_WAITINGPOLICYELEMENTS_TAGTYPE = "SwInteractionResource_AssociationEnd_waitingPolicyElements";

    public static final String SWINTERACTIONRESOURCE_ASSOCIATIONEND_WAITINGQUEUECAPACITY_TAGTYPE = "SwInteractionResource_AssociationEnd_waitingQueueCapacity";

    public static final String SWINTERACTIONRESOURCE_ASSOCIATIONEND_WAITINGQUEUEPOLICY_TAGTYPE = "SwInteractionResource_AssociationEnd_waitingQueuePolicy";

    /**
     * Tells whether a {@link SwInteractionResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << SwInteractionResource_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwInteractionResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << SwInteractionResource_AssociationEnd >> then instantiate a {@link SwInteractionResourceAssociationEnd} proxy.
     * 
     * @return a {@link SwInteractionResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static SwInteractionResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwInteractionResourceAssociationEnd.STEREOTYPE_NAME);
        return SwInteractionResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link SwInteractionResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SwInteractionResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link SwInteractionResourceAssociationEnd} proxy or <i>null</i>.
     */
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
    public static SwInteractionResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (SwInteractionResourceAssociationEnd.canInstantiate(obj))
        	return new SwInteractionResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("SwInteractionResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwInteractionResource_AssociationEnd_waitingPolicyElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwInteractionResource_AssociationEnd_waitingPolicyElements() {
        return this.elt.getTagValues(SwInteractionResourceAssociationEnd.MdaTypes.SWINTERACTIONRESOURCE_ASSOCIATIONEND_WAITINGPOLICYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwInteractionResource_AssociationEnd_waitingQueueCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwInteractionResource_AssociationEnd_waitingQueueCapacity() {
        return this.elt.getTagValue(SwInteractionResourceAssociationEnd.MdaTypes.SWINTERACTIONRESOURCE_ASSOCIATIONEND_WAITINGQUEUECAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwInteractionResource_AssociationEnd_waitingQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwInteractionResource_AssociationEnd_waitingQueuePolicy() {
        return this.elt.getTagValue(SwInteractionResourceAssociationEnd.MdaTypes.SWINTERACTIONRESOURCE_ASSOCIATIONEND_WAITINGQUEUEPOLICY_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwInteractionResource_AssociationEnd_isIntraMemoryPartitionInteraction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSwInteractionResource_AssociationEnd_isIntraMemoryPartitionInteraction() {
        return this.elt.isTagged(SwInteractionResourceAssociationEnd.MdaTypes.SWINTERACTIONRESOURCE_ASSOCIATIONEND_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SwInteractionResource_AssociationEnd_isIntraMemoryPartitionInteraction'
     * <p>Property description:
     * <br/><i></i></p>
     */
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
    public void setSwInteractionResource_AssociationEnd_waitingPolicyElements(final List<String> values) {
        this.elt.putTagValues(SwInteractionResourceAssociationEnd.MdaTypes.SWINTERACTIONRESOURCE_ASSOCIATIONEND_WAITINGPOLICYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwInteractionResource_AssociationEnd_waitingQueueCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwInteractionResource_AssociationEnd_waitingQueueCapacity(final String value) {
        this.elt.putTagValue(SwInteractionResourceAssociationEnd.MdaTypes.SWINTERACTIONRESOURCE_ASSOCIATIONEND_WAITINGQUEUECAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwInteractionResource_AssociationEnd_waitingQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwInteractionResource_AssociationEnd_waitingQueuePolicy(final String value) {
        this.elt.putTagValue(SwInteractionResourceAssociationEnd.MdaTypes.SWINTERACTIONRESOURCE_ASSOCIATIONEND_WAITINGQUEUEPOLICY_TAGTYPE_ELT, value);
    }

    protected SwInteractionResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWINTERACTIONRESOURCE_ASSOCIATIONEND_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT;

        public static TagType SWINTERACTIONRESOURCE_ASSOCIATIONEND_WAITINGQUEUEPOLICY_TAGTYPE_ELT;

        public static TagType SWINTERACTIONRESOURCE_ASSOCIATIONEND_WAITINGQUEUECAPACITY_TAGTYPE_ELT;

        public static TagType SWINTERACTIONRESOURCE_ASSOCIATIONEND_WAITINGPOLICYELEMENTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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

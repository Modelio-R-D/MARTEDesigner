/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << SwCommunicationResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwCommunicationResourceAssociation extends SwInteractionResourceAssociation {
    public static final String STEREOTYPE_NAME = "SwCommunicationResource_Association";

    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATION_BLOCKT_TAGTYPE = "SwCommunicationResource_Association_blockT";

    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATION_CAPACITY_TAGTYPE = "SwCommunicationResource_Association_capacity";

    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATION_ELEMENTSIZE_TAGTYPE = "SwCommunicationResource_Association_elementSize";

    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATION_MAINSCHEDULER_TAGTYPE = "SwCommunicationResource_Association_mainScheduler";

    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATION_PACKETT_TAGTYPE = "SwCommunicationResource_Association_packetT";

    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATION_SPEEDFACTOR_TAGTYPE = "SwCommunicationResource_Association_speedFactor";

    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATION_TRANSMMODE_TAGTYPE = "SwCommunicationResource_Association_transmMode";

    /**
     * Tells whether a {@link SwCommunicationResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << SwCommunicationResource_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << SwCommunicationResource_Association >> then instantiate a {@link SwCommunicationResourceAssociation} proxy.
     * 
     * @return a {@link SwCommunicationResourceAssociation} proxy on the created {@link Association}.
     */
    public static SwCommunicationResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceAssociation.STEREOTYPE_NAME);
        return SwCommunicationResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceAssociation} proxy from a {@link Association} stereotyped << SwCommunicationResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link SwCommunicationResourceAssociation} proxy or <i>null</i>.
     */
    public static SwCommunicationResourceAssociation instantiate(final Association obj) {
        return SwCommunicationResourceAssociation.canInstantiate(obj) ? new SwCommunicationResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceAssociation} proxy from a {@link Association} stereotyped << SwCommunicationResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link SwCommunicationResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwCommunicationResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (SwCommunicationResourceAssociation.canInstantiate(obj))
        	return new SwCommunicationResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("SwCommunicationResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwCommunicationResourceAssociation other = (SwCommunicationResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Association_blockT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwCommunicationResource_Association_blockT() {
        return this.elt.getTagValues(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Association_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwCommunicationResource_Association_capacity() {
        return this.elt.getTagValues(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Association_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwCommunicationResource_Association_elementSize() {
        return this.elt.getTagValue(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Association_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwCommunicationResource_Association_mainScheduler() {
        return this.elt.getTagValue(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Association_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwCommunicationResource_Association_packetT() {
        return this.elt.getTagValues(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Association_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwCommunicationResource_Association_speedFactor() {
        return this.elt.getTagValue(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_SPEEDFACTOR_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Association_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwCommunicationResource_Association_transmMode() {
        return this.elt.getTagValue(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_TRANSMMODE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Association_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Association_blockT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Association_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Association_capacity(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Association_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Association_elementSize(final String value) {
        this.elt.putTagValue(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Association_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Association_mainScheduler(final String value) {
        this.elt.putTagValue(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Association_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Association_packetT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Association_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Association_speedFactor(final String value) {
        this.elt.putTagValue(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Association_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Association_transmMode(final String value) {
        this.elt.putTagValue(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_TRANSMMODE_TAGTYPE_ELT, value);
    }

    protected SwCommunicationResourceAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATION_ELEMENTSIZE_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATION_BLOCKT_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATION_PACKETT_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATION_CAPACITY_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATION_MAINSCHEDULER_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATION_SPEEDFACTOR_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATION_TRANSMMODE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "595ed6e2-10d8-11df-81d9-0014222a9f79");
            SWCOMMUNICATIONRESOURCE_ASSOCIATION_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "73075d66-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ASSOCIATION_BLOCKT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "73078478-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ASSOCIATION_PACKETT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "73078479-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ASSOCIATION_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7307847a-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ASSOCIATION_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8071169c-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ASSOCIATION_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8071169b-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ASSOCIATION_TRANSMMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "65e9642a-60ca-11e3-a828-0027103f347d");
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

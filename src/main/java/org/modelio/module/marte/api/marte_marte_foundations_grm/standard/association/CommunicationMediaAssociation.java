/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association;

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
 * Proxy class to handle a {@link Association} with << CommunicationMedia_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class CommunicationMediaAssociation extends ProcessingResourceAssociation {
    public static final String STEREOTYPE_NAME = "CommunicationMedia_Association";

    public static final String COMMUNICATIONMEDIA_ASSOCIATION_BLOCKT_TAGTYPE = "CommunicationMedia_Association_blockT";

    public static final String COMMUNICATIONMEDIA_ASSOCIATION_CAPACITY_TAGTYPE = "CommunicationMedia_Association_capacity";

    public static final String COMMUNICATIONMEDIA_ASSOCIATION_ELEMENTSIZE_TAGTYPE = "CommunicationMedia_Association_elementSize";

    public static final String COMMUNICATIONMEDIA_ASSOCIATION_PACKETT_TAGTYPE = "CommunicationMedia_Association_packetT";

    public static final String COMMUNICATIONMEDIA_ASSOCIATION_TRANSMMODE_TAGTYPE = "CommunicationMedia_Association_transmMode";

    /**
     * Tells whether a {@link CommunicationMediaAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << CommunicationMedia_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationMediaAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << CommunicationMedia_Association >> then instantiate a {@link CommunicationMediaAssociation} proxy.
     * 
     * @return a {@link CommunicationMediaAssociation} proxy on the created {@link Association}.
     */
    public static CommunicationMediaAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationMediaAssociation.STEREOTYPE_NAME);
        return CommunicationMediaAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationMediaAssociation} proxy from a {@link Association} stereotyped << CommunicationMedia_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link CommunicationMediaAssociation} proxy or <i>null</i>.
     */
    public static CommunicationMediaAssociation instantiate(final Association obj) {
        return CommunicationMediaAssociation.canInstantiate(obj) ? new CommunicationMediaAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationMediaAssociation} proxy from a {@link Association} stereotyped << CommunicationMedia_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link CommunicationMediaAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static CommunicationMediaAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (CommunicationMediaAssociation.canInstantiate(obj))
        	return new CommunicationMediaAssociation(obj);
        else
        	throw new IllegalArgumentException("CommunicationMediaAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        CommunicationMediaAssociation other = (CommunicationMediaAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Association_blockT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getCommunicationMedia_Association_blockT() {
        return this.elt.getTagValues(CommunicationMediaAssociation.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATION_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Association_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getCommunicationMedia_Association_capacity() {
        return this.elt.getTagValues(CommunicationMediaAssociation.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATION_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_Association_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getCommunicationMedia_Association_elementSize() {
        return this.elt.getTagValue(CommunicationMediaAssociation.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATION_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Association_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getCommunicationMedia_Association_packetT() {
        return this.elt.getTagValues(CommunicationMediaAssociation.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATION_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_Association_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getCommunicationMedia_Association_transmMode() {
        return this.elt.getTagValue(CommunicationMediaAssociation.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATION_TRANSMMODE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Association_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setCommunicationMedia_Association_blockT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaAssociation.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATION_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Association_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setCommunicationMedia_Association_capacity(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaAssociation.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATION_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_Association_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setCommunicationMedia_Association_elementSize(final String value) {
        this.elt.putTagValue(CommunicationMediaAssociation.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATION_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Association_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setCommunicationMedia_Association_packetT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaAssociation.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATION_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_Association_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setCommunicationMedia_Association_transmMode(final String value) {
        this.elt.putTagValue(CommunicationMediaAssociation.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATION_TRANSMMODE_TAGTYPE_ELT, value);
    }

    protected CommunicationMediaAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType COMMUNICATIONMEDIA_ASSOCIATION_ELEMENTSIZE_TAGTYPE_ELT;

        public static TagType COMMUNICATIONMEDIA_ASSOCIATION_TRANSMMODE_TAGTYPE_ELT;

        public static TagType COMMUNICATIONMEDIA_ASSOCIATION_BLOCKT_TAGTYPE_ELT;

        public static TagType COMMUNICATIONMEDIA_ASSOCIATION_PACKETT_TAGTYPE_ELT;

        public static TagType COMMUNICATIONMEDIA_ASSOCIATION_CAPACITY_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "24eaca14-0fdd-11df-86ac-0014222a9f79");
            COMMUNICATIONMEDIA_ASSOCIATION_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "27439e9c-0fdd-11df-86ac-0014222a9f79");
            COMMUNICATIONMEDIA_ASSOCIATION_TRANSMMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "27439e9d-0fdd-11df-86ac-0014222a9f79");
            COMMUNICATIONMEDIA_ASSOCIATION_BLOCKT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "27439e9e-0fdd-11df-86ac-0014222a9f79");
            COMMUNICATIONMEDIA_ASSOCIATION_PACKETT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "27439e9f-0fdd-11df-86ac-0014222a9f79");
            COMMUNICATIONMEDIA_ASSOCIATION_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "27439ea0-0fdd-11df-86ac-0014222a9f79");
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

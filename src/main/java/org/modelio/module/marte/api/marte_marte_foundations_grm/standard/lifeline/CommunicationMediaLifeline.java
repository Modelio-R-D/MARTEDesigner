/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << CommunicationMedia_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class CommunicationMediaLifeline extends ProcessingResourceLifeline {
    public static final String STEREOTYPE_NAME = "CommunicationMedia_Lifeline";

    public static final String COMMUNICATIONMEDIA_LIFELINE_BLOCKT_TAGTYPE = "CommunicationMedia_Lifeline_blockT";

    public static final String COMMUNICATIONMEDIA_LIFELINE_CAPACITY_TAGTYPE = "CommunicationMedia_Lifeline_capacity";

    public static final String COMMUNICATIONMEDIA_LIFELINE_ELEMENTSIZE_TAGTYPE = "CommunicationMedia_Lifeline_elementSize";

    public static final String COMMUNICATIONMEDIA_LIFELINE_PACKETT_TAGTYPE = "CommunicationMedia_Lifeline_packetT";

    public static final String COMMUNICATIONMEDIA_LIFELINE_TRANSMMODE_TAGTYPE = "CommunicationMedia_Lifeline_transmMode";

    /**
     * Tells whether a {@link CommunicationMediaLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << CommunicationMedia_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationMediaLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << CommunicationMedia_Lifeline >> then instantiate a {@link CommunicationMediaLifeline} proxy.
     * 
     * @return a {@link CommunicationMediaLifeline} proxy on the created {@link Lifeline}.
     */
    public static CommunicationMediaLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationMediaLifeline.STEREOTYPE_NAME);
        return CommunicationMediaLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationMediaLifeline} proxy from a {@link Lifeline} stereotyped << CommunicationMedia_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link CommunicationMediaLifeline} proxy or <i>null</i>.
     */
    public static CommunicationMediaLifeline instantiate(final Lifeline obj) {
        return CommunicationMediaLifeline.canInstantiate(obj) ? new CommunicationMediaLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationMediaLifeline} proxy from a {@link Lifeline} stereotyped << CommunicationMedia_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link CommunicationMediaLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static CommunicationMediaLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (CommunicationMediaLifeline.canInstantiate(obj))
        	return new CommunicationMediaLifeline(obj);
        else
        	throw new IllegalArgumentException("CommunicationMediaLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        CommunicationMediaLifeline other = (CommunicationMediaLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Lifeline_blockT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getCommunicationMedia_Lifeline_blockT() {
        return this.elt.getTagValues(CommunicationMediaLifeline.MdaTypes.COMMUNICATIONMEDIA_LIFELINE_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Lifeline_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getCommunicationMedia_Lifeline_capacity() {
        return this.elt.getTagValues(CommunicationMediaLifeline.MdaTypes.COMMUNICATIONMEDIA_LIFELINE_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_Lifeline_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getCommunicationMedia_Lifeline_elementSize() {
        return this.elt.getTagValue(CommunicationMediaLifeline.MdaTypes.COMMUNICATIONMEDIA_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Lifeline_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getCommunicationMedia_Lifeline_packetT() {
        return this.elt.getTagValues(CommunicationMediaLifeline.MdaTypes.COMMUNICATIONMEDIA_LIFELINE_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_Lifeline_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getCommunicationMedia_Lifeline_transmMode() {
        return this.elt.getTagValue(CommunicationMediaLifeline.MdaTypes.COMMUNICATIONMEDIA_LIFELINE_TRANSMMODE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Lifeline_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setCommunicationMedia_Lifeline_blockT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaLifeline.MdaTypes.COMMUNICATIONMEDIA_LIFELINE_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Lifeline_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setCommunicationMedia_Lifeline_capacity(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaLifeline.MdaTypes.COMMUNICATIONMEDIA_LIFELINE_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_Lifeline_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setCommunicationMedia_Lifeline_elementSize(final String value) {
        this.elt.putTagValue(CommunicationMediaLifeline.MdaTypes.COMMUNICATIONMEDIA_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Lifeline_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setCommunicationMedia_Lifeline_packetT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaLifeline.MdaTypes.COMMUNICATIONMEDIA_LIFELINE_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_Lifeline_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setCommunicationMedia_Lifeline_transmMode(final String value) {
        this.elt.putTagValue(CommunicationMediaLifeline.MdaTypes.COMMUNICATIONMEDIA_LIFELINE_TRANSMMODE_TAGTYPE_ELT, value);
    }

    protected CommunicationMediaLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType COMMUNICATIONMEDIA_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT;

        public static TagType COMMUNICATIONMEDIA_LIFELINE_TRANSMMODE_TAGTYPE_ELT;

        public static TagType COMMUNICATIONMEDIA_LIFELINE_BLOCKT_TAGTYPE_ELT;

        public static TagType COMMUNICATIONMEDIA_LIFELINE_PACKETT_TAGTYPE_ELT;

        public static TagType COMMUNICATIONMEDIA_LIFELINE_CAPACITY_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0095c02b-0ccf-11df-8525-001302895b2b");
            COMMUNICATIONMEDIA_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0095c032-0ccf-11df-8525-001302895b2b");
            COMMUNICATIONMEDIA_LIFELINE_TRANSMMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0095c039-0ccf-11df-8525-001302895b2b");
            COMMUNICATIONMEDIA_LIFELINE_BLOCKT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00982280-0ccf-11df-8525-001302895b2b");
            COMMUNICATIONMEDIA_LIFELINE_PACKETT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00982287-0ccf-11df-8525-001302895b2b");
            COMMUNICATIONMEDIA_LIFELINE_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0098228e-0ccf-11df-8525-001302895b2b");
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

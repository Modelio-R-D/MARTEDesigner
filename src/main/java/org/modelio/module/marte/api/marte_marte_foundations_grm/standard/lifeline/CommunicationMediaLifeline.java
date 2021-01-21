/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("44d85025-aa3e-48f7-9cca-2662678d0908")
public class CommunicationMediaLifeline extends ProcessingResourceLifeline {
    @objid ("b0f2f69b-7d49-4af8-9d19-687c9120bda5")
    public static final String STEREOTYPE_NAME = "CommunicationMedia_Lifeline";

    @objid ("46b72664-5da0-4750-992c-016046d9e977")
    public static final String COMMUNICATIONMEDIA_LIFELINE_BLOCKT_TAGTYPE = "CommunicationMedia_Lifeline_blockT";

    @objid ("3fc305ee-f014-4149-a8e9-c5092b51888e")
    public static final String COMMUNICATIONMEDIA_LIFELINE_CAPACITY_TAGTYPE = "CommunicationMedia_Lifeline_capacity";

    @objid ("d6a8742a-d955-44b8-8be5-feede952b2ef")
    public static final String COMMUNICATIONMEDIA_LIFELINE_ELEMENTSIZE_TAGTYPE = "CommunicationMedia_Lifeline_elementSize";

    @objid ("f58f2baf-5c14-4dde-9b9b-8ae43780bc34")
    public static final String COMMUNICATIONMEDIA_LIFELINE_PACKETT_TAGTYPE = "CommunicationMedia_Lifeline_packetT";

    @objid ("deafa88e-47d0-41d2-86f9-9ef57c29b69b")
    public static final String COMMUNICATIONMEDIA_LIFELINE_TRANSMMODE_TAGTYPE = "CommunicationMedia_Lifeline_transmMode";

    /**
     * Tells whether a {@link CommunicationMediaLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << CommunicationMedia_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("abb52d81-8cdb-466f-8e52-15b274c610af")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationMediaLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << CommunicationMedia_Lifeline >> then instantiate a {@link CommunicationMediaLifeline} proxy.
     * 
     * @return a {@link CommunicationMediaLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("2914ca40-969c-41e6-86f5-8e816352110e")
    public static CommunicationMediaLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationMediaLifeline.STEREOTYPE_NAME);
        return CommunicationMediaLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationMediaLifeline} proxy from a {@link Lifeline} stereotyped << CommunicationMedia_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link CommunicationMediaLifeline} proxy or <i>null</i>.
     */
    @objid ("70d71f41-9ecc-49ea-8cd8-d77b13b084df")
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
    @objid ("2d641e1c-e036-4dc9-bd54-5b0239cb4f3b")
    public static CommunicationMediaLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (CommunicationMediaLifeline.canInstantiate(obj))
        	return new CommunicationMediaLifeline(obj);
        else
        	throw new IllegalArgumentException("CommunicationMediaLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("37f0f6c4-48ff-48f6-8bde-577e8efbf6c8")
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
    @objid ("3f2eee94-4852-4136-a281-652238b3a6bc")
    public List<String> getCommunicationMedia_Lifeline_blockT() {
        return this.elt.getTagValues(CommunicationMediaLifeline.MdaTypes.COMMUNICATIONMEDIA_LIFELINE_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Lifeline_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4844110b-adcc-4512-9e0f-203a8f60cb91")
    public List<String> getCommunicationMedia_Lifeline_capacity() {
        return this.elt.getTagValues(CommunicationMediaLifeline.MdaTypes.COMMUNICATIONMEDIA_LIFELINE_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_Lifeline_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1a7746b8-bc02-42c7-9992-0ad1bae17d3c")
    public String getCommunicationMedia_Lifeline_elementSize() {
        return this.elt.getTagValue(CommunicationMediaLifeline.MdaTypes.COMMUNICATIONMEDIA_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Lifeline_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d7951096-48c3-4c38-b99d-0113b39387bb")
    public List<String> getCommunicationMedia_Lifeline_packetT() {
        return this.elt.getTagValues(CommunicationMediaLifeline.MdaTypes.COMMUNICATIONMEDIA_LIFELINE_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_Lifeline_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3e1b3fbe-a6d2-4292-9575-701508bed4e0")
    public String getCommunicationMedia_Lifeline_transmMode() {
        return this.elt.getTagValue(CommunicationMediaLifeline.MdaTypes.COMMUNICATIONMEDIA_LIFELINE_TRANSMMODE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("cef4a2f9-1afd-4691-904a-2b669853ca79")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    @objid ("e5a3608c-e1e0-4b7c-8588-ee823d13e122")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Lifeline_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("33788ee9-487e-4511-8389-81b0ae0718b1")
    public void setCommunicationMedia_Lifeline_blockT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaLifeline.MdaTypes.COMMUNICATIONMEDIA_LIFELINE_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Lifeline_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a42c04d6-fa52-4ae4-b4ba-8a7624a013c7")
    public void setCommunicationMedia_Lifeline_capacity(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaLifeline.MdaTypes.COMMUNICATIONMEDIA_LIFELINE_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_Lifeline_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("88648e35-4f21-40c0-b550-0727704427c9")
    public void setCommunicationMedia_Lifeline_elementSize(final String value) {
        this.elt.putTagValue(CommunicationMediaLifeline.MdaTypes.COMMUNICATIONMEDIA_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Lifeline_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e0089965-03a2-41e9-829d-75f46360cb21")
    public void setCommunicationMedia_Lifeline_packetT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaLifeline.MdaTypes.COMMUNICATIONMEDIA_LIFELINE_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_Lifeline_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f2b90145-dfee-4f3e-a178-bf218066884f")
    public void setCommunicationMedia_Lifeline_transmMode(final String value) {
        this.elt.putTagValue(CommunicationMediaLifeline.MdaTypes.COMMUNICATIONMEDIA_LIFELINE_TRANSMMODE_TAGTYPE_ELT, value);
    }

    @objid ("57ae93dd-1173-421a-a5f5-4840470bf682")
    protected CommunicationMediaLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("fe733597-7c2f-4633-ba31-7cc545d31a09")
    public static final class MdaTypes {
        @objid ("97cae21d-9428-4515-8a28-845567db5800")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c5e3762c-be06-4263-911a-bd13eaa9f7a9")
        public static TagType COMMUNICATIONMEDIA_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("78945533-c2c8-415e-8f62-dc9586584aad")
        public static TagType COMMUNICATIONMEDIA_LIFELINE_TRANSMMODE_TAGTYPE_ELT;

        @objid ("f51d648b-1008-44e6-8592-17ba9708211f")
        public static TagType COMMUNICATIONMEDIA_LIFELINE_BLOCKT_TAGTYPE_ELT;

        @objid ("399d32fe-5960-45d8-b9a7-8e457756a931")
        public static TagType COMMUNICATIONMEDIA_LIFELINE_PACKETT_TAGTYPE_ELT;

        @objid ("119dab27-1019-49c3-886e-dca068a576d3")
        public static TagType COMMUNICATIONMEDIA_LIFELINE_CAPACITY_TAGTYPE_ELT;

        @objid ("2bdca16a-8809-4f4f-a8cb-4aaed7d406ae")
        private static Stereotype MDAASSOCDEP;

        @objid ("30cdf03e-542f-4f09-b380-f298de8ed007")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4f0cad3d-a19f-44ee-860d-bf12b6fb986d")
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

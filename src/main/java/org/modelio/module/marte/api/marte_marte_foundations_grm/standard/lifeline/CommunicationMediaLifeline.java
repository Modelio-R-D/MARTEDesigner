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
    @objid ("6f245252-727b-4c38-b00c-a3addfddfeec")
    public static final String STEREOTYPE_NAME = "CommunicationMedia_Lifeline";

    @objid ("38940888-a3bd-4211-9156-7ea6f628b250")
    public static final String COMMUNICATIONMEDIA_LIFELINE_BLOCKT_TAGTYPE = "CommunicationMedia_Lifeline_blockT";

    @objid ("4bc28770-9640-4e51-af2e-811cea6b3e58")
    public static final String COMMUNICATIONMEDIA_LIFELINE_CAPACITY_TAGTYPE = "CommunicationMedia_Lifeline_capacity";

    @objid ("721195e9-aaa7-4ae3-962a-6435d4a3177f")
    public static final String COMMUNICATIONMEDIA_LIFELINE_ELEMENTSIZE_TAGTYPE = "CommunicationMedia_Lifeline_elementSize";

    @objid ("34759fd9-a6a8-48a1-a922-6933bd5cf48f")
    public static final String COMMUNICATIONMEDIA_LIFELINE_PACKETT_TAGTYPE = "CommunicationMedia_Lifeline_packetT";

    @objid ("45174403-abb9-4915-826f-f2380661e44e")
    public static final String COMMUNICATIONMEDIA_LIFELINE_TRANSMMODE_TAGTYPE = "CommunicationMedia_Lifeline_transmMode";

    /**
     * Tells whether a {@link CommunicationMediaLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << CommunicationMedia_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7b339774-1469-463a-bdb4-1c6b6f830c6e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationMediaLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << CommunicationMedia_Lifeline >> then instantiate a {@link CommunicationMediaLifeline} proxy.
     * 
     * @return a {@link CommunicationMediaLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("e10b351e-fbfe-48b4-8be8-a55c81b1c882")
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
    @objid ("2b3215d5-8fb9-4fe5-abbe-5091c23e8110")
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
    @objid ("575f3a66-a2fb-46d4-b922-9d0dbbf717cd")
    public static CommunicationMediaLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (CommunicationMediaLifeline.canInstantiate(obj))
        	return new CommunicationMediaLifeline(obj);
        else
        	throw new IllegalArgumentException("CommunicationMediaLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2e218f34-81a2-40be-b45c-25842c91124c")
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
    @objid ("32d2cbda-41ba-475e-9796-33575f9304f7")
    public List<String> getCommunicationMedia_Lifeline_blockT() {
        return this.elt.getTagValues(CommunicationMediaLifeline.MdaTypes.COMMUNICATIONMEDIA_LIFELINE_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Lifeline_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("123defab-155d-4e57-a175-82bbd9c29366")
    public List<String> getCommunicationMedia_Lifeline_capacity() {
        return this.elt.getTagValues(CommunicationMediaLifeline.MdaTypes.COMMUNICATIONMEDIA_LIFELINE_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_Lifeline_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ec88a803-484a-416f-8c8b-b2950b17a87d")
    public String getCommunicationMedia_Lifeline_elementSize() {
        return this.elt.getTagValue(CommunicationMediaLifeline.MdaTypes.COMMUNICATIONMEDIA_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Lifeline_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1a07d5db-f725-40e3-bed7-6d4841c0ee99")
    public List<String> getCommunicationMedia_Lifeline_packetT() {
        return this.elt.getTagValues(CommunicationMediaLifeline.MdaTypes.COMMUNICATIONMEDIA_LIFELINE_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_Lifeline_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("86ea8657-40e4-406a-8ec1-7af88fdd41ed")
    public String getCommunicationMedia_Lifeline_transmMode() {
        return this.elt.getTagValue(CommunicationMediaLifeline.MdaTypes.COMMUNICATIONMEDIA_LIFELINE_TRANSMMODE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("6ff64e9a-9005-4399-8313-cb7295ad246f")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    @objid ("32464320-731c-4269-862d-6190f51c1604")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Lifeline_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a4dfa773-c740-4bf7-b3e8-772932bd81e1")
    public void setCommunicationMedia_Lifeline_blockT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaLifeline.MdaTypes.COMMUNICATIONMEDIA_LIFELINE_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Lifeline_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e4533703-acd1-47dc-898f-5d0deef1967d")
    public void setCommunicationMedia_Lifeline_capacity(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaLifeline.MdaTypes.COMMUNICATIONMEDIA_LIFELINE_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_Lifeline_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e8e55ee4-49c0-4977-a6fa-9405d444c859")
    public void setCommunicationMedia_Lifeline_elementSize(final String value) {
        this.elt.putTagValue(CommunicationMediaLifeline.MdaTypes.COMMUNICATIONMEDIA_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Lifeline_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3c1adba6-f856-435e-b9b6-9589f5969ec7")
    public void setCommunicationMedia_Lifeline_packetT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaLifeline.MdaTypes.COMMUNICATIONMEDIA_LIFELINE_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_Lifeline_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("05f85d85-07bb-44fa-8ee8-601a6d9d119e")
    public void setCommunicationMedia_Lifeline_transmMode(final String value) {
        this.elt.putTagValue(CommunicationMediaLifeline.MdaTypes.COMMUNICATIONMEDIA_LIFELINE_TRANSMMODE_TAGTYPE_ELT, value);
    }

    @objid ("60051e88-8adf-4a1c-b7bb-2ebf3a144cb6")
    protected CommunicationMediaLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("fe733597-7c2f-4633-ba31-7cc545d31a09")
    public static final class MdaTypes {
        @objid ("7c4451ac-d0d4-497b-9141-2ee9a75addfa")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e14bdf7a-ef10-4b8a-bd85-290db3c97178")
        public static TagType COMMUNICATIONMEDIA_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("48555883-f433-4124-acd8-2a59aa6c0b29")
        public static TagType COMMUNICATIONMEDIA_LIFELINE_TRANSMMODE_TAGTYPE_ELT;

        @objid ("a040772c-df95-4310-a6f5-cb235f068f6e")
        public static TagType COMMUNICATIONMEDIA_LIFELINE_BLOCKT_TAGTYPE_ELT;

        @objid ("888850bc-745f-463c-8ff8-1e4dd397f961")
        public static TagType COMMUNICATIONMEDIA_LIFELINE_PACKETT_TAGTYPE_ELT;

        @objid ("aa486382-59f3-408e-a7e1-2874089f41ca")
        public static TagType COMMUNICATIONMEDIA_LIFELINE_CAPACITY_TAGTYPE_ELT;

        @objid ("0c19af03-d569-4aca-b0b5-51983fe6339c")
        private static Stereotype MDAASSOCDEP;

        @objid ("b8e5676e-aea8-450c-896b-1ecc539493eb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a851348b-9323-48a7-827b-1da498a6f461")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link;

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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << CommunicationMedia_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("64048092-a878-432c-bfe5-6465e8d1e80d")
public class CommunicationMediaLink extends ProcessingResourceLink {
    @objid ("0ba9388e-71b2-458c-b793-97d39b284b42")
    public static final String STEREOTYPE_NAME = "CommunicationMedia_Link";

    @objid ("e9e4927d-560e-4590-9284-b7142a6467c1")
    public static final String COMMUNICATIONMEDIA_LINK_BLOCKT_TAGTYPE = "CommunicationMedia_Link_blockT";

    @objid ("db5fa23e-405e-4cb8-8ced-bbc8ac1e8d4f")
    public static final String COMMUNICATIONMEDIA_LINK_CAPACITY_TAGTYPE = "CommunicationMedia_Link_capacity";

    @objid ("e31b1a82-2848-4ee4-90ff-7ca78493b208")
    public static final String COMMUNICATIONMEDIA_LINK_ELEMENTSIZE_TAGTYPE = "CommunicationMedia_Link_elementSize";

    @objid ("c38f5745-794e-403b-8cf7-491183e7abe7")
    public static final String COMMUNICATIONMEDIA_LINK_PACKETT_TAGTYPE = "CommunicationMedia_Link_packetT";

    @objid ("a6274f90-8ae1-45ce-a3e8-6c3caca2737a")
    public static final String COMMUNICATIONMEDIA_LINK_TRANSMMODE_TAGTYPE = "CommunicationMedia_Link_transmMode";

    /**
     * Tells whether a {@link CommunicationMediaLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << CommunicationMedia_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("03de03f3-d460-46c2-9e1f-147a3cb36d9e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationMediaLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << CommunicationMedia_Link >> then instantiate a {@link CommunicationMediaLink} proxy.
     * 
     * @return a {@link CommunicationMediaLink} proxy on the created {@link Link}.
     */
    @objid ("0a9c4d6c-7494-45a0-abce-46709480d5cd")
    public static CommunicationMediaLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationMediaLink.STEREOTYPE_NAME);
        return CommunicationMediaLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationMediaLink} proxy from a {@link Link} stereotyped << CommunicationMedia_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link CommunicationMediaLink} proxy or <i>null</i>.
     */
    @objid ("167e578b-846e-4553-b5bf-ec335c59e6c4")
    public static CommunicationMediaLink instantiate(final Link obj) {
        return CommunicationMediaLink.canInstantiate(obj) ? new CommunicationMediaLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationMediaLink} proxy from a {@link Link} stereotyped << CommunicationMedia_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link CommunicationMediaLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c729c333-ef59-4c51-9fcf-cfaa7704b16e")
    public static CommunicationMediaLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (CommunicationMediaLink.canInstantiate(obj))
        	return new CommunicationMediaLink(obj);
        else
        	throw new IllegalArgumentException("CommunicationMediaLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("83c55c69-d899-4ec3-9ff2-42c9624aa17a")
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
        CommunicationMediaLink other = (CommunicationMediaLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Link_blockT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("179636c6-e82c-4275-96fb-0736b6ba1a2e")
    public List<String> getCommunicationMedia_Link_blockT() {
        return this.elt.getTagValues(CommunicationMediaLink.MdaTypes.COMMUNICATIONMEDIA_LINK_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Link_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2e4c4c94-10d0-472b-bb27-5709145c4751")
    public List<String> getCommunicationMedia_Link_capacity() {
        return this.elt.getTagValues(CommunicationMediaLink.MdaTypes.COMMUNICATIONMEDIA_LINK_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_Link_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("82ab59da-8819-4079-86b1-644cccbd8de2")
    public String getCommunicationMedia_Link_elementSize() {
        return this.elt.getTagValue(CommunicationMediaLink.MdaTypes.COMMUNICATIONMEDIA_LINK_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Link_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9f4c771a-cab6-4275-98de-64efc63d3206")
    public List<String> getCommunicationMedia_Link_packetT() {
        return this.elt.getTagValues(CommunicationMediaLink.MdaTypes.COMMUNICATIONMEDIA_LINK_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_Link_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d9d2476b-67f5-49fd-beee-53973b0f5b0c")
    public String getCommunicationMedia_Link_transmMode() {
        return this.elt.getTagValue(CommunicationMediaLink.MdaTypes.COMMUNICATIONMEDIA_LINK_TRANSMMODE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("60c9322a-a35c-422b-a959-5e89d16a9ea1")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    @objid ("dc9d5052-496c-4634-847b-53d51db12821")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Link_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9bffd7ed-c587-4ec7-b3cd-9f21b8eb5af2")
    public void setCommunicationMedia_Link_blockT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaLink.MdaTypes.COMMUNICATIONMEDIA_LINK_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Link_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fe447e50-0505-4efc-821c-5b499dfd51bd")
    public void setCommunicationMedia_Link_capacity(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaLink.MdaTypes.COMMUNICATIONMEDIA_LINK_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_Link_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dee2eb22-d1fe-4c44-8719-141b91888018")
    public void setCommunicationMedia_Link_elementSize(final String value) {
        this.elt.putTagValue(CommunicationMediaLink.MdaTypes.COMMUNICATIONMEDIA_LINK_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Link_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("18dc31bd-ca40-4ff8-8609-625b6e83e356")
    public void setCommunicationMedia_Link_packetT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaLink.MdaTypes.COMMUNICATIONMEDIA_LINK_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_Link_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("91d6cfa9-a6c9-4fb1-80e2-a1b6f79b01be")
    public void setCommunicationMedia_Link_transmMode(final String value) {
        this.elt.putTagValue(CommunicationMediaLink.MdaTypes.COMMUNICATIONMEDIA_LINK_TRANSMMODE_TAGTYPE_ELT, value);
    }

    @objid ("4100f5e4-36f5-4e26-a420-c90e8df3fbd9")
    protected CommunicationMediaLink(final Link elt) {
        super(elt);
    }

    @objid ("d4c456a1-ea23-4115-bdf5-e6d3e0e106e3")
    public static final class MdaTypes {
        @objid ("1eda22dc-97b4-4ee9-8b48-a371fa4db3e8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fc30794d-4cb5-4d5c-a1c9-95ea5d32b998")
        public static TagType COMMUNICATIONMEDIA_LINK_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("204e9e84-c59b-47a1-ba38-88e2b8e6ea80")
        public static TagType COMMUNICATIONMEDIA_LINK_TRANSMMODE_TAGTYPE_ELT;

        @objid ("3e4dce3e-36e2-421d-bda3-8441e4827704")
        public static TagType COMMUNICATIONMEDIA_LINK_BLOCKT_TAGTYPE_ELT;

        @objid ("c9d02eb9-bc97-41d0-bd0e-1662226112ee")
        public static TagType COMMUNICATIONMEDIA_LINK_PACKETT_TAGTYPE_ELT;

        @objid ("0d8c421e-99e2-455e-869b-2a3155833cd7")
        public static TagType COMMUNICATIONMEDIA_LINK_CAPACITY_TAGTYPE_ELT;

        @objid ("fa06a93a-2da9-4d7f-b239-48d9ea646724")
        private static Stereotype MDAASSOCDEP;

        @objid ("c830b66e-b4c5-44d0-a306-3e67268a3b95")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b3254296-b6f5-4de7-93e5-e6fa497e14f4")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0095c02f-0ccf-11df-8525-001302895b2b");
            COMMUNICATIONMEDIA_LINK_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0095c036-0ccf-11df-8525-001302895b2b");
            COMMUNICATIONMEDIA_LINK_TRANSMMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0098227d-0ccf-11df-8525-001302895b2b");
            COMMUNICATIONMEDIA_LINK_BLOCKT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00982284-0ccf-11df-8525-001302895b2b");
            COMMUNICATIONMEDIA_LINK_PACKETT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0098228b-0ccf-11df-8525-001302895b2b");
            COMMUNICATIONMEDIA_LINK_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00982292-0ccf-11df-8525-001302895b2b");
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

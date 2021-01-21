/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << CommunicationMedia_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("558455c6-c7d3-407e-9413-f0a87ba85852")
public class CommunicationMediaInstance extends ProcessingResourceInstance {
    @objid ("b523a780-d80e-463b-aac2-b1d4aa606b5d")
    public static final String STEREOTYPE_NAME = "CommunicationMedia_Instance";

    @objid ("b548270a-fdad-46a2-878c-4a81a275fb06")
    public static final String COMMUNICATIONMEDIA_INSTANCE_BLOCKT_TAGTYPE = "CommunicationMedia_Instance_blockT";

    @objid ("f5f441f5-ed15-4e4b-b95b-0880036fd0fc")
    public static final String COMMUNICATIONMEDIA_INSTANCE_CAPACITY_TAGTYPE = "CommunicationMedia_Instance_capacity";

    @objid ("f7e208e2-42a9-494d-8c37-384ea6e3ad56")
    public static final String COMMUNICATIONMEDIA_INSTANCE_ELEMENTSIZE_TAGTYPE = "CommunicationMedia_Instance_elementSize";

    @objid ("be28c0e0-8b3b-47ae-8a29-0827aafa9f5d")
    public static final String COMMUNICATIONMEDIA_INSTANCE_PACKETT_TAGTYPE = "CommunicationMedia_Instance_packetT";

    @objid ("ede184ea-0c40-4a58-8dfa-cd13ec5da871")
    public static final String COMMUNICATIONMEDIA_INSTANCE_TRANSMMODE_TAGTYPE = "CommunicationMedia_Instance_transmMode";

    /**
     * Tells whether a {@link CommunicationMediaInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << CommunicationMedia_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("ef91f4e3-39ce-4b97-83a3-294da7b4252f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationMediaInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << CommunicationMedia_Instance >> then instantiate a {@link CommunicationMediaInstance} proxy.
     * 
     * @return a {@link CommunicationMediaInstance} proxy on the created {@link Instance}.
     */
    @objid ("5db33104-fc2d-4a8d-bc71-fda387c8d68b")
    public static CommunicationMediaInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationMediaInstance.STEREOTYPE_NAME);
        return CommunicationMediaInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationMediaInstance} proxy from a {@link Instance} stereotyped << CommunicationMedia_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link CommunicationMediaInstance} proxy or <i>null</i>.
     */
    @objid ("1dd2fa11-c2b0-47e2-908a-23674f7fc8f6")
    public static CommunicationMediaInstance instantiate(final Instance obj) {
        return CommunicationMediaInstance.canInstantiate(obj) ? new CommunicationMediaInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationMediaInstance} proxy from a {@link Instance} stereotyped << CommunicationMedia_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link CommunicationMediaInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3ec640e4-a80d-467d-a40d-e0a6e8e1871b")
    public static CommunicationMediaInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (CommunicationMediaInstance.canInstantiate(obj))
        	return new CommunicationMediaInstance(obj);
        else
        	throw new IllegalArgumentException("CommunicationMediaInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0989d652-99ad-4ef3-9ed3-07de75383a92")
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
        CommunicationMediaInstance other = (CommunicationMediaInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Instance_blockT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("53df377c-a82b-4c64-9781-8fe844b15d9b")
    public List<String> getCommunicationMedia_Instance_blockT() {
        return this.elt.getTagValues(CommunicationMediaInstance.MdaTypes.COMMUNICATIONMEDIA_INSTANCE_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Instance_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a464584d-55b8-41f0-9187-30d47cdf90d0")
    public List<String> getCommunicationMedia_Instance_capacity() {
        return this.elt.getTagValues(CommunicationMediaInstance.MdaTypes.COMMUNICATIONMEDIA_INSTANCE_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_Instance_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("db331682-a314-46c0-8407-8897dfa73d0a")
    public String getCommunicationMedia_Instance_elementSize() {
        return this.elt.getTagValue(CommunicationMediaInstance.MdaTypes.COMMUNICATIONMEDIA_INSTANCE_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Instance_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("092595b3-6163-4180-afa2-269b8ca88e2e")
    public List<String> getCommunicationMedia_Instance_packetT() {
        return this.elt.getTagValues(CommunicationMediaInstance.MdaTypes.COMMUNICATIONMEDIA_INSTANCE_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_Instance_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("945fc87f-dfdc-4a31-b980-dded439d9e98")
    public String getCommunicationMedia_Instance_transmMode() {
        return this.elt.getTagValue(CommunicationMediaInstance.MdaTypes.COMMUNICATIONMEDIA_INSTANCE_TRANSMMODE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("9bd51c1c-6f31-4b9b-81d9-276c381dc64e")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("115e38f4-d805-4136-8d89-d4c217ad5a70")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Instance_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("76b93d32-bbf3-459a-9b54-85f71284b4aa")
    public void setCommunicationMedia_Instance_blockT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaInstance.MdaTypes.COMMUNICATIONMEDIA_INSTANCE_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Instance_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("719cba49-5586-43f4-8a84-70c2d074ce29")
    public void setCommunicationMedia_Instance_capacity(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaInstance.MdaTypes.COMMUNICATIONMEDIA_INSTANCE_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_Instance_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b9156735-ccab-47e4-89df-e9a119d0233a")
    public void setCommunicationMedia_Instance_elementSize(final String value) {
        this.elt.putTagValue(CommunicationMediaInstance.MdaTypes.COMMUNICATIONMEDIA_INSTANCE_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Instance_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("49a826ad-c8b1-4cd8-8de5-65e71f65e464")
    public void setCommunicationMedia_Instance_packetT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaInstance.MdaTypes.COMMUNICATIONMEDIA_INSTANCE_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_Instance_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bb71574a-4c7b-44a8-913f-bc0d4408520d")
    public void setCommunicationMedia_Instance_transmMode(final String value) {
        this.elt.putTagValue(CommunicationMediaInstance.MdaTypes.COMMUNICATIONMEDIA_INSTANCE_TRANSMMODE_TAGTYPE_ELT, value);
    }

    @objid ("a959c051-d3dd-4d87-8659-8362ec92afd0")
    protected CommunicationMediaInstance(final Instance elt) {
        super(elt);
    }

    @objid ("7d8e8886-2659-42c9-8fe9-bd7902f952c8")
    public static final class MdaTypes {
        @objid ("d4fd1e6e-dec0-4b12-b1aa-39ec499d9d0f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("71929901-c1aa-404f-99b0-f41802a9b6d9")
        public static TagType COMMUNICATIONMEDIA_INSTANCE_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("49fcd155-e879-41aa-b1cd-0ca82c9f9f59")
        public static TagType COMMUNICATIONMEDIA_INSTANCE_TRANSMMODE_TAGTYPE_ELT;

        @objid ("9c3287b8-eb8b-46bb-8a8c-46b31123094b")
        public static TagType COMMUNICATIONMEDIA_INSTANCE_BLOCKT_TAGTYPE_ELT;

        @objid ("7e6d7d4b-2a3c-4839-b6e0-f4c26a948b08")
        public static TagType COMMUNICATIONMEDIA_INSTANCE_PACKETT_TAGTYPE_ELT;

        @objid ("d931ef35-f4e4-4060-bbfc-b60f89493c42")
        public static TagType COMMUNICATIONMEDIA_INSTANCE_CAPACITY_TAGTYPE_ELT;

        @objid ("c8ea19b1-1a30-4681-b366-a6d52da128b4")
        private static Stereotype MDAASSOCDEP;

        @objid ("739e1e3a-5db3-4994-b20d-e7489c50c366")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dd8ff843-2055-40ba-bb64-58c3b94399f9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0095c030-0ccf-11df-8525-001302895b2b");
            COMMUNICATIONMEDIA_INSTANCE_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0095c037-0ccf-11df-8525-001302895b2b");
            COMMUNICATIONMEDIA_INSTANCE_TRANSMMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0098227e-0ccf-11df-8525-001302895b2b");
            COMMUNICATIONMEDIA_INSTANCE_BLOCKT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00982285-0ccf-11df-8525-001302895b2b");
            COMMUNICATIONMEDIA_INSTANCE_PACKETT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0098228c-0ccf-11df-8525-001302895b2b");
            COMMUNICATIONMEDIA_INSTANCE_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00982293-0ccf-11df-8525-001302895b2b");
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("215cd72e-245b-4c27-86d9-99e03d1dda58")
    public static final String STEREOTYPE_NAME = "CommunicationMedia_Instance";

    @objid ("b08fcea5-ff14-4610-8bcb-c06c303fd849")
    public static final String COMMUNICATIONMEDIA_INSTANCE_BLOCKT_TAGTYPE = "CommunicationMedia_Instance_blockT";

    @objid ("123415e7-cc35-4160-96e9-d61091159abd")
    public static final String COMMUNICATIONMEDIA_INSTANCE_CAPACITY_TAGTYPE = "CommunicationMedia_Instance_capacity";

    @objid ("d62223fc-5c2e-42a5-849b-d9a69ec2f201")
    public static final String COMMUNICATIONMEDIA_INSTANCE_ELEMENTSIZE_TAGTYPE = "CommunicationMedia_Instance_elementSize";

    @objid ("083770ff-e690-4905-8732-075a8c7e69d7")
    public static final String COMMUNICATIONMEDIA_INSTANCE_PACKETT_TAGTYPE = "CommunicationMedia_Instance_packetT";

    @objid ("0d207753-9ca0-4710-b57c-cbd56ec7ce8a")
    public static final String COMMUNICATIONMEDIA_INSTANCE_TRANSMMODE_TAGTYPE = "CommunicationMedia_Instance_transmMode";

    /**
     * Tells whether a {@link CommunicationMediaInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << CommunicationMedia_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("66b26e1c-c78b-424e-a0f0-496044c0d843")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationMediaInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << CommunicationMedia_Instance >> then instantiate a {@link CommunicationMediaInstance} proxy.
     * 
     * @return a {@link CommunicationMediaInstance} proxy on the created {@link Instance}.
     */
    @objid ("2a31e29b-8250-49fe-a0e3-400b67da20a9")
    public static CommunicationMediaInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationMediaInstance.STEREOTYPE_NAME);
        return CommunicationMediaInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationMediaInstance} proxy from a {@link Instance} stereotyped << CommunicationMedia_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link CommunicationMediaInstance} proxy or <i>null</i>.
     */
    @objid ("5ac52bd7-9c61-42e8-8187-cfa3cbfe5256")
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
    @objid ("71126a56-8997-41db-8ecd-50ca843dc75c")
    public static CommunicationMediaInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (CommunicationMediaInstance.canInstantiate(obj))
        	return new CommunicationMediaInstance(obj);
        else
        	throw new IllegalArgumentException("CommunicationMediaInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("88953436-5379-4e50-9763-302149c7c034")
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
    @objid ("234af5d0-7540-4f7d-a454-702d94af48e8")
    public List<String> getCommunicationMedia_Instance_blockT() {
        return this.elt.getTagValues(CommunicationMediaInstance.MdaTypes.COMMUNICATIONMEDIA_INSTANCE_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Instance_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("06497161-0a87-4235-9f11-427832aa4b04")
    public List<String> getCommunicationMedia_Instance_capacity() {
        return this.elt.getTagValues(CommunicationMediaInstance.MdaTypes.COMMUNICATIONMEDIA_INSTANCE_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_Instance_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a4ce45c7-655c-449a-a450-4ef559c5014e")
    public String getCommunicationMedia_Instance_elementSize() {
        return this.elt.getTagValue(CommunicationMediaInstance.MdaTypes.COMMUNICATIONMEDIA_INSTANCE_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Instance_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("fdd7d702-4faa-4a56-be5e-7354e58a958b")
    public List<String> getCommunicationMedia_Instance_packetT() {
        return this.elt.getTagValues(CommunicationMediaInstance.MdaTypes.COMMUNICATIONMEDIA_INSTANCE_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_Instance_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("44fec79e-b59b-40f1-a5f3-0a074ae005e7")
    public String getCommunicationMedia_Instance_transmMode() {
        return this.elt.getTagValue(CommunicationMediaInstance.MdaTypes.COMMUNICATIONMEDIA_INSTANCE_TRANSMMODE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("218360d2-057a-4bc5-aa1e-5db42477bbb1")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("a769d7f7-2a02-4b93-8c4c-2182c15b2100")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Instance_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ef9b3059-1dfc-442b-af36-affb5c8901df")
    public void setCommunicationMedia_Instance_blockT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaInstance.MdaTypes.COMMUNICATIONMEDIA_INSTANCE_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Instance_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c07887a9-b4c0-4d81-a034-4ca32f7391d3")
    public void setCommunicationMedia_Instance_capacity(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaInstance.MdaTypes.COMMUNICATIONMEDIA_INSTANCE_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_Instance_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("decf8692-e425-4914-b5bc-361c7d3774c2")
    public void setCommunicationMedia_Instance_elementSize(final String value) {
        this.elt.putTagValue(CommunicationMediaInstance.MdaTypes.COMMUNICATIONMEDIA_INSTANCE_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Instance_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a39505b9-2a90-40cd-8962-a6c5e8c6fa05")
    public void setCommunicationMedia_Instance_packetT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaInstance.MdaTypes.COMMUNICATIONMEDIA_INSTANCE_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_Instance_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2287330d-4c46-4a6e-80f0-084bad7e39a5")
    public void setCommunicationMedia_Instance_transmMode(final String value) {
        this.elt.putTagValue(CommunicationMediaInstance.MdaTypes.COMMUNICATIONMEDIA_INSTANCE_TRANSMMODE_TAGTYPE_ELT, value);
    }

    @objid ("533cdbc5-744d-4bb3-8df5-444402b6a7ed")
    protected CommunicationMediaInstance(final Instance elt) {
        super(elt);
    }

    @objid ("7d8e8886-2659-42c9-8fe9-bd7902f952c8")
    public static final class MdaTypes {
        @objid ("a8dcaacd-6be7-49a8-8de6-77f92fba4da2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d0edcf7c-7b2e-4aa5-9909-1ab1a59613c5")
        public static TagType COMMUNICATIONMEDIA_INSTANCE_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("cc4c893c-bdf7-4fe2-9844-92f2083932b9")
        public static TagType COMMUNICATIONMEDIA_INSTANCE_TRANSMMODE_TAGTYPE_ELT;

        @objid ("3cd8c423-b154-4e86-8f54-196506317476")
        public static TagType COMMUNICATIONMEDIA_INSTANCE_BLOCKT_TAGTYPE_ELT;

        @objid ("6d64b13a-d01c-4b07-a114-2f16da1ea74c")
        public static TagType COMMUNICATIONMEDIA_INSTANCE_PACKETT_TAGTYPE_ELT;

        @objid ("4bcfc86e-cb40-49df-bfb9-1fc2828c080a")
        public static TagType COMMUNICATIONMEDIA_INSTANCE_CAPACITY_TAGTYPE_ELT;

        @objid ("ef238cab-12f5-4b50-9f7a-49651e24a568")
        private static Stereotype MDAASSOCDEP;

        @objid ("c09b0174-d516-4eed-b058-c836ac19cbdd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3a749eab-d1d8-40ff-b612-f9df34a180f8")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << SharedDataComResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("650c8ab5-074c-4435-8042-6427ebbdfe40")
public class SharedDataComResourceAttribute extends SwCommunicationResourceAttribute {
    @objid ("dfac62c8-fc88-44af-b853-7b908c35427b")
    public static final String STEREOTYPE_NAME = "SharedDataComResource_Attribute";

    @objid ("eeb71453-2bc3-4b41-a202-dfb11bf2e770")
    public static final String SHAREDDATACOMRESOURCE_ATTRIBUTE_READSERVICES_TAGTYPE = "SharedDataComResource_Attribute_readServices";

    @objid ("b84bd7aa-8b4b-4286-9ce9-391d72d3a5f2")
    public static final String SHAREDDATACOMRESOURCE_ATTRIBUTE_WRITESERVICES_TAGTYPE = "SharedDataComResource_Attribute_writeServices";

    /**
     * Tells whether a {@link SharedDataComResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << SharedDataComResource_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("376a4d0c-6493-42ec-b693-4f2f2c4f0556")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << SharedDataComResource_Attribute >> then instantiate a {@link SharedDataComResourceAttribute} proxy.
     * 
     * @return a {@link SharedDataComResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("d647b6d0-7859-402e-a387-997cf7f653a6")
    public static SharedDataComResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceAttribute.STEREOTYPE_NAME);
        return SharedDataComResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link SharedDataComResourceAttribute} proxy from a {@link Attribute} stereotyped << SharedDataComResource_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link SharedDataComResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("0ec90dd6-da80-409a-8d5b-c8b34b1a59ad")
    public static SharedDataComResourceAttribute instantiate(final Attribute obj) {
        return SharedDataComResourceAttribute.canInstantiate(obj) ? new SharedDataComResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SharedDataComResourceAttribute} proxy from a {@link Attribute} stereotyped << SharedDataComResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link SharedDataComResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d81f6a57-12da-428a-b618-d6357fcf25bd")
    public static SharedDataComResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SharedDataComResourceAttribute.canInstantiate(obj))
        	return new SharedDataComResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("SharedDataComResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b13cc510-3175-487a-9bb7-457321a47c78")
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
        SharedDataComResourceAttribute other = (SharedDataComResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("43100834-c2ff-4245-94dd-f636aef132e6")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for List<String> property 'SharedDataComResource_Attribute_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1701ede1-744c-4886-93d1-9281c4dc2d86")
    public List<String> getSharedDataComResource_Attribute_readServices() {
        return this.elt.getTagValues(SharedDataComResourceAttribute.MdaTypes.SHAREDDATACOMRESOURCE_ATTRIBUTE_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SharedDataComResource_Attribute_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1a26fcc1-25da-44b8-bd59-6200ba5888b6")
    public List<String> getSharedDataComResource_Attribute_writeServices() {
        return this.elt.getTagValues(SharedDataComResourceAttribute.MdaTypes.SHAREDDATACOMRESOURCE_ATTRIBUTE_WRITESERVICES_TAGTYPE_ELT);
    }

    @objid ("8bcaa4ba-953e-4051-9789-5a2541e33f0b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_Attribute_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("654b53b9-2d46-48f6-ab00-334bc7e3776e")
    public void setSharedDataComResource_Attribute_readServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceAttribute.MdaTypes.SHAREDDATACOMRESOURCE_ATTRIBUTE_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_Attribute_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a3969a9e-cf8e-44b5-aa51-e71f66180e1b")
    public void setSharedDataComResource_Attribute_writeServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceAttribute.MdaTypes.SHAREDDATACOMRESOURCE_ATTRIBUTE_WRITESERVICES_TAGTYPE_ELT, values);
    }

    @objid ("5885cca3-c3e4-4965-825d-b5ad5165dbb7")
    protected SharedDataComResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("a6b29383-70cd-4271-b3e1-1c1e2b949b52")
    public static final class MdaTypes {
        @objid ("d25b349c-c82e-4402-9f01-4ef76863ee80")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("33675078-425b-4795-a5ec-962f2001d0c6")
        public static TagType SHAREDDATACOMRESOURCE_ATTRIBUTE_READSERVICES_TAGTYPE_ELT;

        @objid ("ff706899-4ed6-47e5-9ec7-5d072d19c1e2")
        public static TagType SHAREDDATACOMRESOURCE_ATTRIBUTE_WRITESERVICES_TAGTYPE_ELT;

        @objid ("df51880e-4d0d-4c28-9a1a-dcb249b44f5b")
        private static Stereotype MDAASSOCDEP;

        @objid ("9e15c436-7745-458c-9520-29bdc783d454")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a8b81b26-4d83-46f5-b534-141a05c5bd2c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "02218158-0ccf-11df-8525-001302895b2b");
            SHAREDDATACOMRESOURCE_ATTRIBUTE_READSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0221815f-0ccf-11df-8525-001302895b2b");
            SHAREDDATACOMRESOURCE_ATTRIBUTE_WRITESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02218166-0ccf-11df-8525-001302895b2b");
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

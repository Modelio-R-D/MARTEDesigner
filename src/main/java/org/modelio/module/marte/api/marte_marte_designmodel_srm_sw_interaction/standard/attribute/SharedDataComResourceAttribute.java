/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("11dd9b23-7aed-4bf3-a386-f70cc06227d3")
    public static final String STEREOTYPE_NAME = "SharedDataComResource_Attribute";

    @objid ("ad76703a-139d-4d17-9aed-9759ccc285e5")
    public static final String SHAREDDATACOMRESOURCE_ATTRIBUTE_READSERVICES_TAGTYPE = "SharedDataComResource_Attribute_readServices";

    @objid ("10722e94-cd26-4bea-b651-7e16a2c6f923")
    public static final String SHAREDDATACOMRESOURCE_ATTRIBUTE_WRITESERVICES_TAGTYPE = "SharedDataComResource_Attribute_writeServices";

    /**
     * Tells whether a {@link SharedDataComResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << SharedDataComResource_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4d8d2a07-d72a-426d-9c6f-d3365bd40d10")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << SharedDataComResource_Attribute >> then instantiate a {@link SharedDataComResourceAttribute} proxy.
     * 
     * @return a {@link SharedDataComResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("906605f1-0326-4fbf-8c77-257963a3f486")
    public static SharedDataComResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceAttribute.STEREOTYPE_NAME);
        return SharedDataComResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link SharedDataComResourceAttribute} proxy from a {@link Attribute} stereotyped << SharedDataComResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link SharedDataComResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("bc6b4555-528e-4d73-8578-98f0e60aa7f2")
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
    @objid ("e779d512-1483-4d8f-85eb-93d2ce2b5d09")
    public static SharedDataComResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SharedDataComResourceAttribute.canInstantiate(obj))
        	return new SharedDataComResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("SharedDataComResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6b1879f6-4a13-4545-aaf5-0062779e4cc8")
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
    @objid ("b47a5ecb-5738-410b-97cd-1cd161f4126d")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for List<String> property 'SharedDataComResource_Attribute_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e5f72f23-0eff-4fec-8e97-c34de8dd8831")
    public List<String> getSharedDataComResource_Attribute_readServices() {
        return this.elt.getTagValues(SharedDataComResourceAttribute.MdaTypes.SHAREDDATACOMRESOURCE_ATTRIBUTE_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SharedDataComResource_Attribute_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("268eefc1-6097-4db6-ba66-0084c480261c")
    public List<String> getSharedDataComResource_Attribute_writeServices() {
        return this.elt.getTagValues(SharedDataComResourceAttribute.MdaTypes.SHAREDDATACOMRESOURCE_ATTRIBUTE_WRITESERVICES_TAGTYPE_ELT);
    }

    @objid ("5f849d24-8c44-4b1f-8a44-90b7bf0bf349")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_Attribute_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("91f62ca2-5c28-485a-a9ea-cb8fb347ab24")
    public void setSharedDataComResource_Attribute_readServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceAttribute.MdaTypes.SHAREDDATACOMRESOURCE_ATTRIBUTE_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_Attribute_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d592912e-1db4-448c-8b82-066f4f192b8c")
    public void setSharedDataComResource_Attribute_writeServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceAttribute.MdaTypes.SHAREDDATACOMRESOURCE_ATTRIBUTE_WRITESERVICES_TAGTYPE_ELT, values);
    }

    @objid ("9b0eeb6c-1e1c-4f9c-b54d-209add3fa7ce")
    protected SharedDataComResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("a6b29383-70cd-4271-b3e1-1c1e2b949b52")
    public static final class MdaTypes {
        @objid ("175c1ccb-69fe-419f-850d-1ce0f4487796")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f1ce3140-3add-4457-8f1d-5031a81b80e7")
        public static TagType SHAREDDATACOMRESOURCE_ATTRIBUTE_READSERVICES_TAGTYPE_ELT;

        @objid ("c093edaa-b8b5-4498-9eeb-2ec5bdb85190")
        public static TagType SHAREDDATACOMRESOURCE_ATTRIBUTE_WRITESERVICES_TAGTYPE_ELT;

        @objid ("ae9a11a2-6a73-4de2-9a33-edd9c4be7c88")
        private static Stereotype MDAASSOCDEP;

        @objid ("dc54fce6-c9ee-42a1-9a80-b334384a1f5f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7f4a411e-58ca-4294-8870-6631c2f96c14")
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

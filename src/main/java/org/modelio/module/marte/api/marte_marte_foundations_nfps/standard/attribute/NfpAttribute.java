/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_nfps.standard.attribute;

import java.util.ArrayList;
import java.util.Collections;
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
 * Proxy class to handle a {@link Attribute} with << Nfp_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("5f83b6f6-d757-4933-a185-bf02e2cf84dc")
public class NfpAttribute {
    @objid ("43272b1d-509c-43be-9eeb-91a5aaa969bb")
    public static final String STEREOTYPE_NAME = "Nfp_Attribute";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    @objid ("1a198a44-1463-41a9-a8cd-a1ea7d03ef55")
    protected final Attribute elt;

    /**
     * Tells whether a {@link NfpAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << Nfp_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("c1c24d5a-6a49-4e8d-9019-ae69ec294708")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, NfpAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << Nfp_Attribute >> then instantiate a {@link NfpAttribute} proxy.
     * 
     * @return a {@link NfpAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("7e84714c-1d48-48f0-b7a2-3f6a63f75635")
    public static NfpAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, NfpAttribute.STEREOTYPE_NAME);
        return NfpAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link NfpAttribute} proxy from a {@link Attribute} stereotyped << Nfp_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link NfpAttribute} proxy or <i>null</i>.
     */
    @objid ("a351992e-ae38-475c-a387-1bae1b2700e0")
    public static NfpAttribute instantiate(final Attribute obj) {
        return NfpAttribute.canInstantiate(obj) ? new NfpAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NfpAttribute} proxy from a {@link Attribute} stereotyped << Nfp_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link NfpAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("19395aa6-e8cf-4d71-b2c9-6557c935ec52")
    public static NfpAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (NfpAttribute.canInstantiate(obj))
        	return new NfpAttribute(obj);
        else
        	throw new IllegalArgumentException("NfpAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ac42c838-64b9-4691-8cd7-3573aa08bee4")
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
        NfpAttribute other = (NfpAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("d52574b1-9d93-4fb5-bb58-a9ad5bef1e2f")
    public Attribute getElement() {
        return this.elt;
    }

    @objid ("a06dd844-5395-47bf-bfaa-74183aebad41")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("02b98c38-bdfd-4cbe-b24e-5c3b26f92016")
    protected NfpAttribute(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("5144f570-8607-4363-8143-9496c6f6bab6")
    public static final class MdaTypes {
        @objid ("19e52a2d-65b7-4f4e-a1b3-6c5f4c2dbd9a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d872132b-b04f-4d28-8365-f0f531bb247a")
        private static Stereotype MDAASSOCDEP;

        @objid ("4c4e3d68-6e02-426c-a859-69969f893992")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c912fe27-7a44-4372-ad15-2a4afa01e55a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d9490074-0cce-11df-8525-001302895b2b");
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

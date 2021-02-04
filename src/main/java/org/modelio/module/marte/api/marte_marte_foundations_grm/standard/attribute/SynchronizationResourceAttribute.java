/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute;

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
 * Proxy class to handle a {@link Attribute} with << SynchronizationResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e73a49f8-e8f7-4f2b-ad9d-5c16a7f51522")
public class SynchronizationResourceAttribute extends ResourceAttribute {
    @objid ("d83ce098-a9d9-4bf7-b60d-aa74cac21698")
    public static final String STEREOTYPE_NAME = "SynchronizationResource_Attribute";

    /**
     * Tells whether a {@link SynchronizationResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << SynchronizationResource_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("31d4385f-1b91-4966-b442-5a50237f492d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SynchronizationResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << SynchronizationResource_Attribute >> then instantiate a {@link SynchronizationResourceAttribute} proxy.
     * 
     * @return a {@link SynchronizationResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("ae2639a5-a5ee-44c1-a118-8e76a3fb9920")
    public static SynchronizationResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SynchronizationResourceAttribute.STEREOTYPE_NAME);
        return SynchronizationResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link SynchronizationResourceAttribute} proxy from a {@link Attribute} stereotyped << SynchronizationResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link SynchronizationResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("0adb4886-9eda-4f78-abc9-7ad09f4f1a3b")
    public static SynchronizationResourceAttribute instantiate(final Attribute obj) {
        return SynchronizationResourceAttribute.canInstantiate(obj) ? new SynchronizationResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SynchronizationResourceAttribute} proxy from a {@link Attribute} stereotyped << SynchronizationResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link SynchronizationResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4d6462a5-0cce-4aeb-b09e-2acfa34c113f")
    public static SynchronizationResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SynchronizationResourceAttribute.canInstantiate(obj))
        	return new SynchronizationResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("SynchronizationResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("82d1e129-c74e-407e-b198-fc4286c00d07")
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
        SynchronizationResourceAttribute other = (SynchronizationResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("54726006-503f-4cce-82ce-f0ed6d69e984")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    @objid ("e1733aaf-fcd5-4831-8ab7-d7bdf6e34c3d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("aea1213d-575c-4f1a-8288-3b66da20002d")
    protected SynchronizationResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("28a67bea-e29c-4297-9d51-a4c773e8d6b3")
    public static final class MdaTypes {
        @objid ("450ed727-cd33-4535-ac68-2d8a23331745")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a8f87ef4-079c-450b-ad82-75dd7526d394")
        private static Stereotype MDAASSOCDEP;

        @objid ("43a789fd-b8d8-4e7d-8aa0-639ed49fab00")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b2f3ffd4-84ac-4cbd-94ec-f54d2bbb9a16")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ffa75824-0cce-11df-8525-001302895b2b");
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

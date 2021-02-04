/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.attribute;

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
 * Proxy class to handle a {@link Attribute} with << SwSynchronizationResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f5026788-df5a-4165-89ed-89e5d34dcbc6")
public class SwSynchronizationResourceAttribute extends SwInteractionResourceAttribute {
    @objid ("3a39e9ff-4a72-43f0-a9ad-d831ef383a54")
    public static final String STEREOTYPE_NAME = "SwSynchronizationResource_Attribute";

    /**
     * Tells whether a {@link SwSynchronizationResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << SwSynchronizationResource_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b7cf3051-4f81-4f07-bb0e-fb151013cc18")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwSynchronizationResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << SwSynchronizationResource_Attribute >> then instantiate a {@link SwSynchronizationResourceAttribute} proxy.
     * 
     * @return a {@link SwSynchronizationResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("e22ef00c-7e30-48a1-a700-0f2726a9a992")
    public static SwSynchronizationResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwSynchronizationResourceAttribute.STEREOTYPE_NAME);
        return SwSynchronizationResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link SwSynchronizationResourceAttribute} proxy from a {@link Attribute} stereotyped << SwSynchronizationResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link SwSynchronizationResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("92c0df76-5a2b-4ba3-99fd-770465962aa9")
    public static SwSynchronizationResourceAttribute instantiate(final Attribute obj) {
        return SwSynchronizationResourceAttribute.canInstantiate(obj) ? new SwSynchronizationResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwSynchronizationResourceAttribute} proxy from a {@link Attribute} stereotyped << SwSynchronizationResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link SwSynchronizationResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("346b711e-cf95-4553-b8c0-8c1a83511796")
    public static SwSynchronizationResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SwSynchronizationResourceAttribute.canInstantiate(obj))
        	return new SwSynchronizationResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("SwSynchronizationResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("dfe2d953-ef6f-49ae-b722-4fd27757dd78")
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
        SwSynchronizationResourceAttribute other = (SwSynchronizationResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("b60255fa-8e71-45cb-82f6-1e61a2b99ebc")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    @objid ("28c124d5-cfdc-412c-99c4-d7aa7368b1b4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("279a38c4-79d4-4cc8-bf23-bdf238bc8597")
    protected SwSynchronizationResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("fd295b4a-6d12-4d18-823b-a91d646ebe68")
    public static final class MdaTypes {
        @objid ("0a1cde1c-7b5c-4bfd-b079-1871449f7522")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("16690684-b0a6-4f52-b982-61bee9e76e16")
        private static Stereotype MDAASSOCDEP;

        @objid ("06109540-3dae-4a39-9807-49b855167280")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c6ab976f-cabe-4f28-b19f-89efe8baf0eb")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0217f811-0ccf-11df-8525-001302895b2b");
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

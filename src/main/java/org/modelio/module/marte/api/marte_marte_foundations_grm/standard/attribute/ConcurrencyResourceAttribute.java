/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
 * Proxy class to handle a {@link Attribute} with << ConcurrencyResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("4787fc50-911d-45f4-9ede-8f0258211395")
public class ConcurrencyResourceAttribute extends ResourceAttribute {
    @objid ("079d7b36-b8a5-44e9-ac85-a586fbca4f9e")
    public static final String STEREOTYPE_NAME = "ConcurrencyResource_Attribute";

    /**
     * Tells whether a {@link ConcurrencyResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << ConcurrencyResource_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("2ca9b54d-8233-4285-9c95-14687f98b68d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ConcurrencyResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << ConcurrencyResource_Attribute >> then instantiate a {@link ConcurrencyResourceAttribute} proxy.
     * 
     * @return a {@link ConcurrencyResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("fd501e11-40d2-4cf2-b62e-8b7f0d1987ab")
    public static ConcurrencyResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ConcurrencyResourceAttribute.STEREOTYPE_NAME);
        return ConcurrencyResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link ConcurrencyResourceAttribute} proxy from a {@link Attribute} stereotyped << ConcurrencyResource_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link ConcurrencyResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("d3a29d5b-4ef1-4b3e-a286-c20e748e3ee5")
    public static ConcurrencyResourceAttribute instantiate(final Attribute obj) {
        return ConcurrencyResourceAttribute.canInstantiate(obj) ? new ConcurrencyResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ConcurrencyResourceAttribute} proxy from a {@link Attribute} stereotyped << ConcurrencyResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link ConcurrencyResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1603c2eb-761f-411d-b1f8-254831abd6b6")
    public static ConcurrencyResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (ConcurrencyResourceAttribute.canInstantiate(obj))
        	return new ConcurrencyResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("ConcurrencyResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("178f4f61-99a3-4842-9b61-72efcdfd6c70")
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
        ConcurrencyResourceAttribute other = (ConcurrencyResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("2fec1c3c-5c41-446e-a778-d915938b2de4")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    @objid ("fe88c738-c655-4ce5-a74d-14e003cdab99")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("669b5287-59ad-4758-97a7-ef5fb61f478f")
    protected ConcurrencyResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("26a849b4-b65b-4590-84d2-3bbce326d51a")
    public static final class MdaTypes {
        @objid ("51d03ea5-4a2c-485d-91ab-a974407ecb91")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0cd4c0b5-871f-4074-80d7-ec8b87cc01db")
        private static Stereotype MDAASSOCDEP;

        @objid ("ef15d42f-6d87-4cdd-b72c-5ee9e186db46")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ec0f374b-cd12-40a1-98f0-9bb2ec576892")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "65a23c07-0f3e-11df-8c52-0014222a9f79");
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

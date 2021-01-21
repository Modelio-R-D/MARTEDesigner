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
 * Proxy class to handle a {@link Attribute} with << ComputingResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("05f47c77-4ae3-422e-a5fe-9b618675ed32")
public class ComputingResourceAttribute extends MutualExclusionResourceAttribute {
    @objid ("cd13d92e-bf26-48ba-8d52-b6bfbc69b944")
    public static final String STEREOTYPE_NAME = "ComputingResource_Attribute";

    /**
     * Tells whether a {@link ComputingResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << ComputingResource_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("77aa3d6c-df0e-4028-8a8a-a6abbdc5c363")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ComputingResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << ComputingResource_Attribute >> then instantiate a {@link ComputingResourceAttribute} proxy.
     * 
     * @return a {@link ComputingResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("a0fd7f4b-13a4-410c-8d4b-b12f7da16963")
    public static ComputingResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ComputingResourceAttribute.STEREOTYPE_NAME);
        return ComputingResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link ComputingResourceAttribute} proxy from a {@link Attribute} stereotyped << ComputingResource_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link ComputingResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("df0e9325-8339-4423-b87d-39514dd1a9c1")
    public static ComputingResourceAttribute instantiate(final Attribute obj) {
        return ComputingResourceAttribute.canInstantiate(obj) ? new ComputingResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ComputingResourceAttribute} proxy from a {@link Attribute} stereotyped << ComputingResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link ComputingResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ab6ab68e-dd03-4832-8219-e31ed559b84c")
    public static ComputingResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (ComputingResourceAttribute.canInstantiate(obj))
        	return new ComputingResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("ComputingResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("56aa86b8-25ec-4a7f-975b-63706bf7258c")
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
        ComputingResourceAttribute other = (ComputingResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("8bfbb8d0-e631-4682-b33b-c4118079be36")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    @objid ("074beecd-e425-40a7-b2c8-ba2d3555a7d2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("e5c39392-27d7-4d86-a0a3-f73cc40ba147")
    protected ComputingResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("e63acd02-af3e-4a7d-8cd6-ddb3436ae74c")
    public static final class MdaTypes {
        @objid ("9b37d21f-4e13-4449-9dca-ea4a13cc500a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ed56a999-d3b6-44cd-b251-dd3154816070")
        private static Stereotype MDAASSOCDEP;

        @objid ("e8d7a8dc-e792-4843-b786-db2867b89eed")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d85c634f-2afa-427d-99da-67dc89c044b0")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "009a84d1-0ccf-11df-8525-001302895b2b");
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

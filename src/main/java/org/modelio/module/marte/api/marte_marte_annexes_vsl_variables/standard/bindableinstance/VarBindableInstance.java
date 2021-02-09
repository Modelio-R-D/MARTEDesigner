/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_annexes_vsl_variables.standard.bindableinstance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link BindableInstance} with << Var_BindableInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class VarBindableInstance {
    public static final String STEREOTYPE_NAME = "Var_BindableInstance";

    public static final String VAR_BINDABLEINSTANCE_DIR_TAGTYPE = "Var_BindableInstance_dir";

    /**
     * The underlying {@link BindableInstance} represented by this proxy, never null.
     */
    protected final BindableInstance elt;

    /**
     * Tells whether a {@link VarBindableInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link BindableInstance} stereotyped << Var_BindableInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof BindableInstance) && ((BindableInstance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, VarBindableInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link BindableInstance} stereotyped << Var_BindableInstance >> then instantiate a {@link VarBindableInstance} proxy.
     * 
     * @return a {@link VarBindableInstance} proxy on the created {@link BindableInstance}.
     */
    public static VarBindableInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.BindableInstance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, VarBindableInstance.STEREOTYPE_NAME);
        return VarBindableInstance.instantiate((BindableInstance)e);
    }

    /**
     * Tries to instantiate a {@link VarBindableInstance} proxy from a {@link BindableInstance} stereotyped << Var_BindableInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a BindableInstance
     * @return a {@link VarBindableInstance} proxy or <i>null</i>.
     */
    public static VarBindableInstance instantiate(final BindableInstance obj) {
        return VarBindableInstance.canInstantiate(obj) ? new VarBindableInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link VarBindableInstance} proxy from a {@link BindableInstance} stereotyped << Var_BindableInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link BindableInstance}
     * @return a {@link VarBindableInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static VarBindableInstance safeInstantiate(final BindableInstance obj) throws IllegalArgumentException {
        if (VarBindableInstance.canInstantiate(obj))
        	return new VarBindableInstance(obj);
        else
        	throw new IllegalArgumentException("VarBindableInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
        VarBindableInstance other = (VarBindableInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link BindableInstance}. 
     * @return the BindableInstance represented by this proxy, never null.
     */
    public BindableInstance getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Var_BindableInstance_dir'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getVar_BindableInstance_dir() {
        return this.elt.getTagValue(VarBindableInstance.MdaTypes.VAR_BINDABLEINSTANCE_DIR_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Var_BindableInstance_dir'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setVar_BindableInstance_dir(final String value) {
        this.elt.putTagValue(VarBindableInstance.MdaTypes.VAR_BINDABLEINSTANCE_DIR_TAGTYPE_ELT, value);
    }

    protected VarBindableInstance(final BindableInstance elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType VAR_BINDABLEINSTANCE_DIR_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03dcf104-0ccf-11df-8525-001302895b2b");
            VAR_BINDABLEINSTANCE_DIR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03dcf107-0ccf-11df-8525-001302895b2b");
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

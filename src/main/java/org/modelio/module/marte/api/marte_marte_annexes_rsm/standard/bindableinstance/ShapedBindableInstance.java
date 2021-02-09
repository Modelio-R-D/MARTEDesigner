/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.bindableinstance;

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
 * Proxy class to handle a {@link BindableInstance} with << Shaped_BindableInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class ShapedBindableInstance {
    public static final String STEREOTYPE_NAME = "Shaped_BindableInstance";

    public static final String SHAPED_BINDABLEINSTANCE_SHAPE_TAGTYPE = "Shaped_BindableInstance_shape";

    /**
     * The underlying {@link BindableInstance} represented by this proxy, never null.
     */
    protected final BindableInstance elt;

    /**
     * Tells whether a {@link ShapedBindableInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link BindableInstance} stereotyped << Shaped_BindableInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof BindableInstance) && ((BindableInstance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ShapedBindableInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link BindableInstance} stereotyped << Shaped_BindableInstance >> then instantiate a {@link ShapedBindableInstance} proxy.
     * 
     * @return a {@link ShapedBindableInstance} proxy on the created {@link BindableInstance}.
     */
    public static ShapedBindableInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.BindableInstance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ShapedBindableInstance.STEREOTYPE_NAME);
        return ShapedBindableInstance.instantiate((BindableInstance)e);
    }

    /**
     * Tries to instantiate a {@link ShapedBindableInstance} proxy from a {@link BindableInstance} stereotyped << Shaped_BindableInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a BindableInstance
     * @return a {@link ShapedBindableInstance} proxy or <i>null</i>.
     */
    public static ShapedBindableInstance instantiate(final BindableInstance obj) {
        return ShapedBindableInstance.canInstantiate(obj) ? new ShapedBindableInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ShapedBindableInstance} proxy from a {@link BindableInstance} stereotyped << Shaped_BindableInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link BindableInstance}
     * @return a {@link ShapedBindableInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static ShapedBindableInstance safeInstantiate(final BindableInstance obj) throws IllegalArgumentException {
        if (ShapedBindableInstance.canInstantiate(obj))
        	return new ShapedBindableInstance(obj);
        else
        	throw new IllegalArgumentException("ShapedBindableInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        ShapedBindableInstance other = (ShapedBindableInstance) obj;
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
     * Getter for string property 'Shaped_BindableInstance_shape'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getShaped_BindableInstance_shape() {
        return this.elt.getTagValue(ShapedBindableInstance.MdaTypes.SHAPED_BINDABLEINSTANCE_SHAPE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Shaped_BindableInstance_shape'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setShaped_BindableInstance_shape(final String value) {
        this.elt.putTagValue(ShapedBindableInstance.MdaTypes.SHAPED_BINDABLEINSTANCE_SHAPE_TAGTYPE_ELT, value);
    }

    protected ShapedBindableInstance(final BindableInstance elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SHAPED_BINDABLEINSTANCE_SHAPE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0cb86541-14b5-11df-9d54-0014222a9f79");
            SHAPED_BINDABLEINSTANCE_SHAPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0cb86542-14b5-11df-9d54-0014222a9f79");
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

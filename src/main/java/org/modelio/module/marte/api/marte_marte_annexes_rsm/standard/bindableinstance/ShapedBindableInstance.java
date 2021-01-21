/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.bindableinstance;

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
@objid ("5a4d37a4-1bdb-49f9-92a5-4ccd58e39d5a")
public class ShapedBindableInstance {
    @objid ("f4a0529c-0024-4a84-8d7d-952daed12762")
    public static final String STEREOTYPE_NAME = "Shaped_BindableInstance";

    @objid ("744c643c-5b04-4f54-a237-bf261bcc8ff3")
    public static final String SHAPED_BINDABLEINSTANCE_SHAPE_TAGTYPE = "Shaped_BindableInstance_shape";

    /**
     * The underlying {@link BindableInstance} represented by this proxy, never null.
     */
    @objid ("47a022e8-c0c5-4d09-a811-9b391e1a698f")
    protected final BindableInstance elt;

    /**
     * Tells whether a {@link ShapedBindableInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link BindableInstance} stereotyped << Shaped_BindableInstance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("88591371-bedd-46d0-bc4f-e564d1a5285b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof BindableInstance) && ((BindableInstance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ShapedBindableInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link BindableInstance} stereotyped << Shaped_BindableInstance >> then instantiate a {@link ShapedBindableInstance} proxy.
     * 
     * @return a {@link ShapedBindableInstance} proxy on the created {@link BindableInstance}.
     */
    @objid ("e6fc9868-3096-4524-b428-910308f5d687")
    public static ShapedBindableInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("BindableInstance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ShapedBindableInstance.STEREOTYPE_NAME);
        return ShapedBindableInstance.instantiate((BindableInstance)e);
    }

    /**
     * Tries to instantiate a {@link ShapedBindableInstance} proxy from a {@link BindableInstance} stereotyped << Shaped_BindableInstance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a BindableInstance
     * @return a {@link ShapedBindableInstance} proxy or <i>null</i>.
     */
    @objid ("5c11f405-a8b4-4a1b-900d-8a4095a59c4d")
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
    @objid ("3f6100fd-e4a2-4b29-a5db-cff16c88a310")
    public static ShapedBindableInstance safeInstantiate(final BindableInstance obj) throws IllegalArgumentException {
        if (ShapedBindableInstance.canInstantiate(obj))
        	return new ShapedBindableInstance(obj);
        else
        	throw new IllegalArgumentException("ShapedBindableInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d06360ec-9f91-4ae8-a74a-99ab1430c902")
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
    @objid ("46feb394-c3b8-4832-be7b-ee43b08cdaa6")
    public BindableInstance getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Shaped_BindableInstance_shape'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6f6f1926-9b00-4042-b6a4-f0ca92425767")
    public String getShaped_BindableInstance_shape() {
        return this.elt.getTagValue(ShapedBindableInstance.MdaTypes.SHAPED_BINDABLEINSTANCE_SHAPE_TAGTYPE_ELT);
    }

    @objid ("49b1ccd2-f030-46dd-8c4b-50a6a4214fbf")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Shaped_BindableInstance_shape'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("06bc791c-30b8-4c8b-a221-9adb07a7804e")
    public void setShaped_BindableInstance_shape(final String value) {
        this.elt.putTagValue(ShapedBindableInstance.MdaTypes.SHAPED_BINDABLEINSTANCE_SHAPE_TAGTYPE_ELT, value);
    }

    @objid ("9d444017-8584-455b-b4f5-1c4d11786af6")
    protected ShapedBindableInstance(final BindableInstance elt) {
        this.elt = elt;
    }

    @objid ("e213c091-14c0-420b-887c-1d1c89879861")
    public static final class MdaTypes {
        @objid ("075deccd-70eb-46eb-a5ed-94d20770d9ef")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ef98b37f-62b2-4c5f-9bf0-26f39c482c5c")
        public static TagType SHAPED_BINDABLEINSTANCE_SHAPE_TAGTYPE_ELT;

        @objid ("0b67285c-c8bd-4beb-9aef-87c3fcb6c16f")
        private static Stereotype MDAASSOCDEP;

        @objid ("8798c68f-bb83-45cc-b5d5-267e4c3ddf30")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("57cf842f-e9bd-4cec-b397-fea354bf25e3")
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

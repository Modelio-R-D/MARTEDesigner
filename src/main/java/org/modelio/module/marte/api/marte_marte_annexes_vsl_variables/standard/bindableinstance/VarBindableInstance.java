/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_annexes_vsl_variables.standard.bindableinstance;

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
 * Proxy class to handle a {@link BindableInstance} with << Var_BindableInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("011f3eb0-e493-47c4-a8ce-d6f3f7d07e88")
public class VarBindableInstance {
    @objid ("872d0158-0cbf-47d7-aa34-dd095178f1eb")
    public static final String STEREOTYPE_NAME = "Var_BindableInstance";

    @objid ("6be932d7-0e38-486d-a0ff-5cb29a53dd0e")
    public static final String VAR_BINDABLEINSTANCE_DIR_TAGTYPE = "Var_BindableInstance_dir";

    /**
     * The underlying {@link BindableInstance} represented by this proxy, never null.
     */
    @objid ("2809951d-0fd5-4ec6-93da-517475238c72")
    protected final BindableInstance elt;

    /**
     * Tells whether a {@link VarBindableInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link BindableInstance} stereotyped << Var_BindableInstance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("16779b51-baaf-4fa4-8a72-aeba2327e6b2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof BindableInstance) && ((BindableInstance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, VarBindableInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link BindableInstance} stereotyped << Var_BindableInstance >> then instantiate a {@link VarBindableInstance} proxy.
     * 
     * @return a {@link VarBindableInstance} proxy on the created {@link BindableInstance}.
     */
    @objid ("ef58e9d7-34fc-4314-885a-db4caeda4129")
    public static VarBindableInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("BindableInstance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, VarBindableInstance.STEREOTYPE_NAME);
        return VarBindableInstance.instantiate((BindableInstance)e);
    }

    /**
     * Tries to instantiate a {@link VarBindableInstance} proxy from a {@link BindableInstance} stereotyped << Var_BindableInstance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a BindableInstance
     * @return a {@link VarBindableInstance} proxy or <i>null</i>.
     */
    @objid ("df724332-4a6a-4820-9d6e-350099dd5009")
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
    @objid ("3508b33f-8a29-4ad6-8337-f1169c11da09")
    public static VarBindableInstance safeInstantiate(final BindableInstance obj) throws IllegalArgumentException {
        if (VarBindableInstance.canInstantiate(obj))
        	return new VarBindableInstance(obj);
        else
        	throw new IllegalArgumentException("VarBindableInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("09b4dada-42d2-484f-a852-7e2712de12f7")
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
    @objid ("b0a130ec-da60-4c01-a6d4-e3af0b77fdde")
    public BindableInstance getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Var_BindableInstance_dir'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("23b73923-4316-4b46-b6f8-1723298df36b")
    public String getVar_BindableInstance_dir() {
        return this.elt.getTagValue(VarBindableInstance.MdaTypes.VAR_BINDABLEINSTANCE_DIR_TAGTYPE_ELT);
    }

    @objid ("cc4cd241-d544-4a13-9211-67d81f198a9f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Var_BindableInstance_dir'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c9f4e6a2-4acb-417a-85bf-4061efc952f0")
    public void setVar_BindableInstance_dir(final String value) {
        this.elt.putTagValue(VarBindableInstance.MdaTypes.VAR_BINDABLEINSTANCE_DIR_TAGTYPE_ELT, value);
    }

    @objid ("b7f6617a-f6fd-4bec-b58f-1d5660c27f40")
    protected VarBindableInstance(final BindableInstance elt) {
        this.elt = elt;
    }

    @objid ("ca9bcec8-4ab9-48a5-bc7b-aa49be30dca0")
    public static final class MdaTypes {
        @objid ("e9d866b5-3ab1-404d-88b6-6a6c0f88cbaf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1560116a-4a59-4c8d-b5d8-3447fce8c133")
        public static TagType VAR_BINDABLEINSTANCE_DIR_TAGTYPE_ELT;

        @objid ("e2a38dcf-f637-44c7-8397-25302de0bedc")
        private static Stereotype MDAASSOCDEP;

        @objid ("6fb73c05-ba1f-40fc-994a-a5a3e56689b6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("de214ad6-68b9-401b-98ed-e03002826e16")
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

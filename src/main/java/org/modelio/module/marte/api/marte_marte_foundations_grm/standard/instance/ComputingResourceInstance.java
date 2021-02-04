/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << ComputingResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("13d958be-a4a1-4362-a949-f283d553c926")
public class ComputingResourceInstance extends ProcessingResourceInstance {
    @objid ("85dda0e5-bba3-4302-93e3-3589651928d2")
    public static final String STEREOTYPE_NAME = "ComputingResource_Instance";

    /**
     * Tells whether a {@link ComputingResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << ComputingResource_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("567cb66e-27e6-4a11-ad35-5c7a37434b8d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ComputingResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << ComputingResource_Instance >> then instantiate a {@link ComputingResourceInstance} proxy.
     * 
     * @return a {@link ComputingResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("645a5298-a850-4e9f-8931-e661cecf92d0")
    public static ComputingResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ComputingResourceInstance.STEREOTYPE_NAME);
        return ComputingResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link ComputingResourceInstance} proxy from a {@link Instance} stereotyped << ComputingResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link ComputingResourceInstance} proxy or <i>null</i>.
     */
    @objid ("f811c792-f098-4bb2-b40e-a924fad39542")
    public static ComputingResourceInstance instantiate(final Instance obj) {
        return ComputingResourceInstance.canInstantiate(obj) ? new ComputingResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ComputingResourceInstance} proxy from a {@link Instance} stereotyped << ComputingResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link ComputingResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8e30ab99-428c-443f-9a44-e77d3897b6d2")
    public static ComputingResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (ComputingResourceInstance.canInstantiate(obj))
        	return new ComputingResourceInstance(obj);
        else
        	throw new IllegalArgumentException("ComputingResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("abd46361-4693-47a5-943e-c15cb3c727f4")
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
        ComputingResourceInstance other = (ComputingResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("5fe7fb07-fba7-4019-a524-d7b06ed2a2a3")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("2b72117f-3524-4194-8ffc-82ba5c063023")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("7f56743e-3cde-46e3-92c8-5552ae4b458c")
    protected ComputingResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("87eaa2d1-b933-4edd-b3db-c00dbe58efc4")
    public static final class MdaTypes {
        @objid ("0403275d-18c0-4d38-b1aa-57ee4820de7e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("190e5e7b-19b1-4408-8bca-e1f85df1d4aa")
        private static Stereotype MDAASSOCDEP;

        @objid ("b474fc94-c562-4a7a-bd27-d81f0b23ac71")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("88938804-ef07-49c7-bb01-4c041751d250")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "009a84d4-0ccf-11df-8525-001302895b2b");
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

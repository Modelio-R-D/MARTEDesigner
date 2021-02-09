/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << StorageResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class StorageResourceLifeline extends ResourceLifeline {
    public static final String STEREOTYPE_NAME = "StorageResource_Lifeline";

    public static final String STORAGERESOURCE_LIFELINE_ELEMENTSIZE_TAGTYPE = "StorageResource_Lifeline_elementSize";

    /**
     * Tells whether a {@link StorageResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << StorageResource_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, StorageResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << StorageResource_Lifeline >> then instantiate a {@link StorageResourceLifeline} proxy.
     * 
     * @return a {@link StorageResourceLifeline} proxy on the created {@link Lifeline}.
     */
    public static StorageResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, StorageResourceLifeline.STEREOTYPE_NAME);
        return StorageResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link StorageResourceLifeline} proxy from a {@link Lifeline} stereotyped << StorageResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link StorageResourceLifeline} proxy or <i>null</i>.
     */
    public static StorageResourceLifeline instantiate(final Lifeline obj) {
        return StorageResourceLifeline.canInstantiate(obj) ? new StorageResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link StorageResourceLifeline} proxy from a {@link Lifeline} stereotyped << StorageResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link StorageResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static StorageResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (StorageResourceLifeline.canInstantiate(obj))
        	return new StorageResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("StorageResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        StorageResourceLifeline other = (StorageResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'StorageResource_Lifeline_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getStorageResource_Lifeline_elementSize() {
        return this.elt.getTagValue(StorageResourceLifeline.MdaTypes.STORAGERESOURCE_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'StorageResource_Lifeline_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setStorageResource_Lifeline_elementSize(final String value) {
        this.elt.putTagValue(StorageResourceLifeline.MdaTypes.STORAGERESOURCE_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    protected StorageResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType STORAGERESOURCE_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d0377f27-0f49-11df-8c52-0014222a9f79");
            STORAGERESOURCE_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0f873113-0f4a-11df-8c52-0014222a9f79");
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("ef6f96f3-cf70-49b7-8ca4-ca6f8b38c73d")
public class StorageResourceLifeline extends ResourceLifeline {
    @objid ("d3239523-5d5a-4046-a57f-347717d788ad")
    public static final String STEREOTYPE_NAME = "StorageResource_Lifeline";

    @objid ("a13096d2-8a78-4305-9292-d8f420e81325")
    public static final String STORAGERESOURCE_LIFELINE_ELEMENTSIZE_TAGTYPE = "StorageResource_Lifeline_elementSize";

    /**
     * Tells whether a {@link StorageResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << StorageResource_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("de13b4a0-cb62-4c14-87a2-b0232b0ba1c4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, StorageResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << StorageResource_Lifeline >> then instantiate a {@link StorageResourceLifeline} proxy.
     * 
     * @return a {@link StorageResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("e4690c14-f436-4429-897b-a9b392d8975c")
    public static StorageResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, StorageResourceLifeline.STEREOTYPE_NAME);
        return StorageResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link StorageResourceLifeline} proxy from a {@link Lifeline} stereotyped << StorageResource_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link StorageResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("bcadfe7f-f25b-4efd-bbd1-5a193995658e")
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
    @objid ("7c32290e-937c-4086-812e-3505061c7398")
    public static StorageResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (StorageResourceLifeline.canInstantiate(obj))
        	return new StorageResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("StorageResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("cc858d8c-1ded-42e9-ae5a-1764b5071e2d")
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
    @objid ("eca83ec9-0f24-48d9-b8a1-f449992b6114")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'StorageResource_Lifeline_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c8394e11-f1d7-4962-a1e2-01913b948cc3")
    public String getStorageResource_Lifeline_elementSize() {
        return this.elt.getTagValue(StorageResourceLifeline.MdaTypes.STORAGERESOURCE_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT);
    }

    @objid ("eb5a2942-25a7-494b-aab2-24f904010637")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'StorageResource_Lifeline_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ee78fa63-f3b4-46be-847e-597e4a9515a6")
    public void setStorageResource_Lifeline_elementSize(final String value) {
        this.elt.putTagValue(StorageResourceLifeline.MdaTypes.STORAGERESOURCE_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    @objid ("75ecaeee-1c71-4397-bd6f-832348ee20be")
    protected StorageResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("788ced6c-660f-4bd3-9410-495fe7cec640")
    public static final class MdaTypes {
        @objid ("35b591f5-a9e9-445b-9966-d4bd8933f2a5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5413c349-42c5-46f1-8705-180e3a59a02a")
        public static TagType STORAGERESOURCE_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("59befd26-9704-4509-80b1-75611143fbf4")
        private static Stereotype MDAASSOCDEP;

        @objid ("2cc49781-df43-4331-996c-f01579cb9708")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("76acf79b-cc6a-485b-aa2b-3826a522d20d")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier;

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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << StorageResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("3b293e71-53e4-467b-8b54-f5a60f7e45ce")
public class StorageResourceClassifier extends ResourceClassifier {
    @objid ("1d011bf7-4977-40f4-a865-e0411dc8bda7")
    public static final String STEREOTYPE_NAME = "StorageResource_Classifier";

    @objid ("149a6e54-aac8-494e-964b-3be0b5af35a8")
    public static final String STORAGERESOURCE_CLASSIFIER_ELEMENTSIZE_TAGTYPE = "StorageResource_Classifier_elementSize";

    /**
     * Tells whether a {@link StorageResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << StorageResource_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("975568e1-31ac-4543-90bf-299fe3c40b32")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, StorageResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << StorageResource_Classifier >> then instantiate a {@link StorageResourceClassifier} proxy.
     * 
     * @return a {@link StorageResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("d8c03576-e310-4f7c-9536-353c50223031")
    public static StorageResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, StorageResourceClassifier.STEREOTYPE_NAME);
        return StorageResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link StorageResourceClassifier} proxy from a {@link Classifier} stereotyped << StorageResource_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link StorageResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("5756c073-0f83-4388-9c5d-87325e2f8177")
    public static StorageResourceClassifier instantiate(final Classifier obj) {
        return StorageResourceClassifier.canInstantiate(obj) ? new StorageResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link StorageResourceClassifier} proxy from a {@link Classifier} stereotyped << StorageResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link StorageResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b44c7e04-6b53-4c25-8989-07530af53f6a")
    public static StorageResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (StorageResourceClassifier.canInstantiate(obj))
        	return new StorageResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("StorageResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d71e7d35-2fd5-4999-8703-bbbaf975606c")
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
        StorageResourceClassifier other = (StorageResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("e94f194f-d56e-4c6c-be20-a4564ad59e81")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'StorageResource_Classifier_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0446008e-b023-4190-a487-b5c82702d640")
    public String getStorageResource_Classifier_elementSize() {
        return this.elt.getTagValue(StorageResourceClassifier.MdaTypes.STORAGERESOURCE_CLASSIFIER_ELEMENTSIZE_TAGTYPE_ELT);
    }

    @objid ("7a33a75c-c8b4-488c-836d-67fcc28d4f94")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'StorageResource_Classifier_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bab044a5-543f-4501-80e8-98b59b04ec04")
    public void setStorageResource_Classifier_elementSize(final String value) {
        this.elt.putTagValue(StorageResourceClassifier.MdaTypes.STORAGERESOURCE_CLASSIFIER_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    @objid ("8f8ccd62-765b-4dba-a6c5-a24ec97ae22e")
    protected StorageResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("d5c6ab05-9552-440e-b696-b22c626e37b2")
    public static final class MdaTypes {
        @objid ("d3f67488-d626-465b-9df3-a2520110e4a7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("597a6e76-07ce-4716-b699-ff723fc837b0")
        public static TagType STORAGERESOURCE_CLASSIFIER_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("01df7874-b04e-470a-84e2-8ede61a91dc7")
        private static Stereotype MDAASSOCDEP;

        @objid ("c7c0dcd8-9b59-4710-b0fb-f8b327139a54")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dd2d6507-5a7f-4496-bacc-ed2a845d460e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ee775507-0f49-11df-8c52-0014222a9f79");
            STORAGERESOURCE_CLASSIFIER_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "10d9beff-0f4a-11df-8c52-0014222a9f79");
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
